#!/bin/bash

read char

if [ "$char" = "n" ] || [ "$char" = "N" ]
then
    echo "NO"
elif [ "$char" = "y" ] || [ "$char" = "Y" ]
then
    echo "YES"
fi
