#!/bin/bash

for i in {0..99}
do
	mkdir $i
	touch $i/"program$i.kt"
done
