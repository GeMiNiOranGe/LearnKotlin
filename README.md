# LearnKotlin

## Option 1

```bash
kotlinc Main.kt -include-runtime -d Main.jar
# And
java -jar Main.jar
```
- The -d option indicates the output path for generated class files, which may be either a directory or a .jar file.
- The -include-runtime option makes the resulting .jar file self-contained and runnable by including the Kotlin runtime library in it.

## Option 2 (Recommend)
```bash
kotlinc Main.kt -d Main.jar
# And
kotlin -classpath Main.jar MainKt
```

## Option 3

Don't want the `*.jar` file? Use this code below
```bash
kotlinc Main.kt
# And
kotlin MainKt
```
