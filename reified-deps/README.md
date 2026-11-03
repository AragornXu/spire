# Reified Typelevel dependencies

This nested sbt build republishes the JVM production sources of
`org.typelevel:cats-kernel_3:2.9.0` and `org.typelevel:algebra_3:2.9.0` with the
reified Scala compiler and bootstrapped standard library used by this Spire
checkout.

The source trees were extracted from the corresponding 2.9.0 Maven source
artifacts. Two sorted-collection call sites use explicit Scala 3 `using`
arguments for compatibility with the bootstrapped standard-library signatures;
their behavior is unchanged. The original Typelevel MIT license headers remain
in every source file.

Spire loads this build automatically. From Spire's sbt shell:

```text
clean
reifiedBenchmark/compile
```

`clean` also cleans this dependency build. Compiling a Spire JVM module with
the reified compiler first compiles and publishes Cats Kernel and Algebra to
Ivy local, before resolving Spire's dependencies. The publishing tasks are
shared across modules in each sbt task invocation; compilation remains
incremental. A publishing failure stops the dependent Spire task.

Both builds read compiler, standard-library, and dependency artifact versions
from `versions.properties` in this directory. After publishing a new compiler,
update that file and run `reload` in Spire. If you republish compiler changes
under the same version, restart sbt and run `clean` before compiling again so
the dependencies are rebuilt too.

To compile all JVM modules, use `rootJVM/compile`. The nested dependencies are
JVM-only.

You can still publish both artifacts independently from this directory with:

```shell
sbt -batch catsKernel/publishLocal algebra/publishLocal
```

The resulting coordinates are:

- `org.typelevel:cats-kernel_3:2.9.0-reified-SNAPSHOT`
- `org.typelevel:algebra_3:2.9.0-reified-SNAPSHOT`
