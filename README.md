# META-TDDE21 - A Yocto metalayer for building images for the Raspberry Pi

This README file contains information on the contents of the meta-tdde21 layer.

Please see the corresponding sections below for details.

## Dependencies

  URI: git@github.com:jumpnow/meta-rpi
  branch: sumo

## Patches

Please submit any patches against the meta-tdde21 layer to the xxxx mailing list (xxxx@zzzz.org)
and cc: the maintainer:

Maintainer: Santi Pagola <sanpa993@student.liu.se>

## Table of Contents

  I. Adding the meta-tdde21 layer to your build
 II. Misc


### Adding the meta-tdde21 layer to your build

 Run `bitbake-layers add-layer meta-tdde21`.

### Misc

There is a script under the `scripts` directory which flashes the bitbaked images onto the SD card.
Run the script with the `-h` flag to see what it does.
