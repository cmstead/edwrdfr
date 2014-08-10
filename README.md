# edwrdfr

Edwrdfr is a program to modernize your strings by removing all the lower-case vowels.

## Installation

Just download the jar file and run it.

## Usage

Execute the jar as you would any java jar (like the following) and pass in a string you want to "modernize."

    $ java -jar edwrdfr.jar [-y] <your string with or without spaces>

The -y switch enables the y-removal option

## Options

Enable y character removal with the -y switch.

## Examples

Standard use (y-removal disabled)

    $ java -jar edwrdfr.jar My new product name
    
    ; Output:
    ; My  nw  prdct  nm

Y-removal use

    $ java -jar edwrdfr.jar -y My new product name
    
    ; Output:
    ; M  nw  prdct  nm

## License

This is free. You want it? You can use and distribute it. You don't even need to give me attribution. Enjoy.