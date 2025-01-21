# Java Uncommon Bug: ArrayIndexOutOfBoundsException

This repository demonstrates a common yet sometimes subtle Java error: the `ArrayIndexOutOfBoundsException`. The bug is well-known but serves as a reminder of careful array handling.

## Bug Description

The `UncommonBug.java` file contains a simple program that attempts to access an element in an array beyond its allocated size. This leads to the `ArrayIndexOutOfBoundsException` at runtime.

## Solution

The `UncommonBugSolution.java` demonstrates how to prevent this error by using a `try-catch` block for exception handling and introducing runtime error checks.