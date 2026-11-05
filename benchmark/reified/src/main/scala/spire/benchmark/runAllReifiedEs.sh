#!/usr/bin/env bash

#change TARGET and SVG_DIR!!

# assumes:
#   espresso is in $HOME/graal/espresso
#   labs jdk is called labs-21 in sdkman

SPIRE_ROOT="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")/../../../../../../.." && pwd)"

read_version() {
    awk -F= -v key="$1" '$1 == key { print $2; exit }' "$SPIRE_ROOT/reified-deps/versions.properties"
}

SCALA_VERSION="$(read_version scalaVersion)"
LIBRARY_VERSION="$(read_version libraryVersion)"
CATS_KERNEL_VERSION="$(read_version catsKernelVersion)"
ALGEBRA_VERSION="$(read_version algebraVersion)"

SCALA_CLASSPATH=(
    "$SPIRE_ROOT/benchmark/reified/target/scala-$SCALA_VERSION/classes"
    "$SPIRE_ROOT/core/.jvm/target/scala-$SCALA_VERSION/classes"
    "$SPIRE_ROOT/macros/.jvm/target/scala-3.2.2/classes"
    "$SPIRE_ROOT/platform/jvm/target/scala-$SCALA_VERSION/classes"
    "$SPIRE_ROOT/util/.jvm/target/scala-$SCALA_VERSION/classes"
    "$HOME/.ivy2/local/org.typelevel/algebra_3/$ALGEBRA_VERSION/jars/algebra_3.jar"
    "$HOME/.ivy2/local/org.typelevel/cats-kernel_3/$CATS_KERNEL_VERSION/jars/cats-kernel_3.jar"
    "$HOME/.ivy2/local/org.scala-lang/scala-library/$LIBRARY_VERSION/jars/scala-library.jar"
)
printf -v SCALA_CLASSES '%s:' "${SCALA_CLASSPATH[@]}"
SCALA_CLASSES="${SCALA_CLASSES%:}"

# result txt file:
NAME="spire-master-inlineTraits"
TARGET="$SPIRE_ROOT/benchmark/reified/src/main/scala/spire/benchmark/$NAME.txt"

: > "$TARGET"

# where the flame graph goes
SVG_DIR="$HOME/graal/espresso/$NAME"
FLAMEGRAPH=false
INLINING=false
TRACE_INLINING=false

INLINING_OUTPUT_DIR="$HOME/spire/benchmark/reified/src/main/scala/spire/benchmark/inlining-output/"

mkdir -p "$INLINING_OUTPUT_DIR"

mkdir -p "$SVG_DIR"

cd "$HOME/graal/espresso"

git log -2 >> "$TARGET"

INLINE_BUDGET=2400000
# INLINE_RECURSION_DEPTH=4
if [ "$INLINING" = true ]; then 
    INLINE_OPT="--experimental-options \
    --compiler.InliningExpansionBudget=$INLINE_BUDGET \
    --compiler.InliningInliningBudget=$INLINE_BUDGET"
    # --compiler.InliningRecursionDepth=$INLINE_RECURSION_DEPTH"
    if [ "$TRACE_INLINING" = true ]; then 
	    TRACE_INLINING_OPT="--compiler.TraceInliningDetails" 
    fi
fi

pwd

source "$HOME/.sdkman/bin/sdkman-init.sh"

if [ "$FLAMEGRAPH" = true ]; then 
    CPUSAMPLER="--cpusampler=flamegraph"; 
fi

echo "Java version"

sdk use java labs-21

mx --env jvm-ce build

mx --env jvm-ce espresso -version >> "$TARGET"

echo "inlining option: $INLINE_OPT" >> "$TARGET"
echo "trace inlining option: $TRACE_INLINING_OPT" >> "$TARGET"
echo "cpu sampler option: $CPUSAMPLER" >> "$TARGET"

echo "ComplexMono" >> "$TARGET"
mx --env jvm-ce espresso $INLINE_OPT $TRACE_INLINING_OPT $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedComplexMono.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.ComplexMono >> "$TARGET" 2>&1

echo "ComplexMega" >> "$TARGET"
mx --env jvm-ce espresso $INLINE_OPT $TRACE_INLINING_OPT $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedComplexMega.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.ComplexMega >> "$TARGET" 2>&1

echo "JetMono" >> "$TARGET"
mx --env jvm-ce espresso $INLINE_OPT $TRACE_INLINING_OPT $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedJetMono.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.JetMono >> "$TARGET" 2>&1

echo "JetMega" >> "$TARGET"
mx --env jvm-ce espresso $INLINE_OPT $TRACE_INLINING_OPT $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedJetMega.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.JetMega >> "$TARGET" 2>&1

echo "PolynomialMono" >> "$TARGET"
mx --env jvm-ce espresso $INLINE_OPT $TRACE_INLINING_OPT $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedPolynomialMono.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.PolynomialMono >> "$TARGET" 2>&1

echo "PolynomialMega" >> "$TARGET"
mx --env jvm-ce espresso $INLINE_OPT $TRACE_INLINING_OPT $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedPolynomialMega.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.PolynomialMega >> "$TARGET" 2>&1

echo "QuaternionMono" >> "$TARGET"
mx --env jvm-ce espresso $INLINE_OPT $TRACE_INLINING_OPT $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedQuaternionMono.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.QuaternionMono >> "$TARGET" 2>&1

echo "QuaternionMega" >> "$TARGET"
mx --env jvm-ce espresso $INLINE_OPT $TRACE_INLINING_OPT $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedQuaternionMega.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.QuaternionMega >> "$TARGET" 2>&1

echo "RingMono" >> "$TARGET"
mx --env jvm-ce espresso $INLINE_OPT $TRACE_INLINING_OPT $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedRingMono.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.RingMono >> "$TARGET" 2>&1

echo "RingMega" >> "$TARGET"
mx --env jvm-ce espresso $INLINE_OPT $TRACE_INLINING_OPT $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedRingMega.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.RingMega >> "$TARGET" 2>&1
