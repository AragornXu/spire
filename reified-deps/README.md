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

Publish both artifacts to Ivy local with:

```shell
sbt -batch catsKernel/publishLocal algebra/publishLocal
```

The resulting coordinates are:

- `org.typelevel:cats-kernel_3:2.9.0-reified-SNAPSHOT`
- `org.typelevel:algebra_3:2.9.0-reified-SNAPSHOT`
