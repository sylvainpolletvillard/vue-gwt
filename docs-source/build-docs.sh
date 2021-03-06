#!/bin/bash

echo "-> Build examples"
cd examples
mvn clean package
cd ..

echo "-> Copy built examples to Gitbook"
mkdir book/resources/scripts
rm book/resources/scripts/*
cp examples/target/vue-gwt-examples-*/VueGwtExamples/* book/resources/scripts/

echo "-> Build Gitbook"
cd book
gitbook build
cd ..

echo "-> Copy built Gitbook to docs"
cd ..
rm -rf docs/*
cp -r docs-source/book/_book/* docs/
rm docs/dependencies.md # Useless file getting copied
git add docs

echo "Success!"