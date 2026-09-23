#change TARGET and SVG_DIR!!

# assumes:
#   espresso is in $HOME/graal/espresso
#   labs jdk is called labs-21 in sdkman

# result txt file:
TARGET='$HOME/spire/benchmark/reified/src/main/scala/spire/benchmark/spire-dev-9-18.txt'

: > "$TARGET"

# where the flame graph goes
SVG_DIR='$HOME/graal/espresso/svg-after-9-18'

mkdir -p "$SVG_DIR"

SCALA_CLASSES='$HOME/spire/benchmark/reified/target/scala-3.10.0-RC1-bin-SNAPSHOT-nonbootstrapped/classes:$HOME/spire/core/.jvm/target/scala-3.10.0-RC1-bin-SNAPSHOT-nonbootstrapped/classes:$HOME/spire/macros/.jvm/target/scala-3.2.2/classes:$HOME/spire/platform/jvm/target/scala-3.10.0-RC1-bin-SNAPSHOT-nonbootstrapped/classes:$HOME/spire/util/.jvm/target/scala-3.10.0-RC1-bin-SNAPSHOT-nonbootstrapped/classes:$HOME/.ivy2/local/org.typelevel/algebra_3/2.9.0-reified-SNAPSHOT/jars/algebra_3.jar:$HOME/.ivy2/local/org.typelevel/cats-kernel_3/2.9.0-reified-SNAPSHOT/jars/cats-kernel_3.jar:$HOME/.ivy2/local/org.scala-lang/scala3-library_3/3.10.0-RC1-bin-SNAPSHOT/jars/scala3-library_3.jar:$HOME/.ivy2/local/org.scala-lang/scala-library/3.10.0-RC1-bin-SNAPSHOT/jars/scala-library.jar'

cd '$HOME/graal/espresso'

git log -2 >> "$TARGET"

pwd

source "$HOME/.sdkman/bin/sdkman-init.sh"

CPUSAMPLER="--cpusampler=flamegraph"

echo "Java version"

sdk use java labs-21

mx --env jvm-ce build

mx --env jvm-ce espresso -version >> "$TARGET"

echo "ComplexMono" >> "$TARGET"
mx --env jvm-ce espresso $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedComplexMono.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.ComplexMono >> "$TARGET" 2>&1

echo "ComplexMega" >> "$TARGET"
mx --env jvm-ce espresso $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedComplexMega.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.ComplexMega >> "$TARGET" 2>&1

echo "JetMono" >> "$TARGET"
mx --env jvm-ce espresso $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedJetMono.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.JetMono >> "$TARGET" 2>&1

echo "JetMega" >> "$TARGET"
mx --env jvm-ce espresso $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedJetMega.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.JetMega >> "$TARGET" 2>&1

echo "PolynomialMono" >> "$TARGET"
mx --env jvm-ce espresso $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedPolynomialMono.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.PolynomialMono >> "$TARGET" 2>&1

echo "PolynomialMega" >> "$TARGET"
mx --env jvm-ce espresso $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedPolynomialMega.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.PolynomialMega >> "$TARGET" 2>&1

echo "QuaternionMono" >> "$TARGET"
mx --env jvm-ce espresso $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedQuaternionMono.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.QuaternionMono >> "$TARGET" 2>&1

echo "QuaternionMega" >> "$TARGET"
mx --env jvm-ce espresso $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedQuaternionMega.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.QuaternionMega >> "$TARGET" 2>&1

echo "RingMono" >> "$TARGET"
mx --env jvm-ce espresso $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedRingMono.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.RingMono >> "$TARGET" 2>&1

echo "RingMega" >> "$TARGET"
mx --env jvm-ce espresso $CPUSAMPLER --cpusampler.OutputFile="$SVG_DIR/reifiedRingMega.svg" -cp "$SCALA_CLASSES" spire.benchmark.reified.RingMega >> "$TARGET" 2>&1