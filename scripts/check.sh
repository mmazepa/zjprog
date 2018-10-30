#!/bin/bash
javac src/$1.java
java -jar tools/ckjm-1.9.jar src/$1.class
