# Moonlight-Android, Daydream VR/Google Cardboard Fork

This is a fork of Moonlight-Android which adds an option in the settings to stream the game to a
virtual monitor to Daydream VR/Google Cardboard.

There may be issues, I've only tested this on my Google Pixel XL and Daydream VR headset. Feel free
to open new issues on Github about bugs you encounter.

## What works
Controller input using a 360 controller connected directly to the phone.

## Activating the virtual monitor feature
In the settings menu reachable from the settings/gear icon on the top left of the screen, scroll all
the way down and enable the "Enable Google VR Virtual Monitor Mode" checkbox.

## Other notes about this fork
Below is the normal readme. The steps for building this Daydream VR/Google Cardboard fork are the
same as the original steps below.

# Moonlight-Android

[Moonlight](http://moonlight-stream.com) is an open source implementation of NVIDIA's GameStream, as used by the NVIDIA Shield.
We reverse engineered the Shield streaming software and created a version that can be run on any Android device.

Moonlight will allow you to stream your full collection of games from your Windows PC to your Android device,
whether in your own home or over the internet.

[Moonlight-pc](https://github.com/moonlight-stream/moonlight-pc) is also currently in development for Windows, OS X and Linux. Versions for [iOS](https://github.com/moonlight-stream/moonlight-ios) and [Windows and Windows Phone](https://github.com/moonlight-stream/moonlight-windows) are also in development.

Check our [wiki](https://github.com/moonlight-stream/moonlight-docs/wiki) for more detailed information or a troubleshooting guide. 

## Features

* Streams any of your games from your PC to your Android device
* Full gamepad support for MOGA, Xbox 360, PS3, OUYA, and Shield
* Automatically finds GameStream-compatible PCs on your network

## Installation

* Download and install Moonlight for Android from
[Google Play](https://play.google.com/store/apps/details?id=com.limelight), [Amazon App Store](http://www.amazon.com/gp/product/B00JK4MFN2), or directly from the [releases page](https://github.com/moonlight-stream/moonlight-android/releases)
* Download [GeForce Experience](http://www.geforce.com/geforce-experience) and install on your Windows PC

## Requirements

* [GameStream compatible](http://shield.nvidia.com/play-pc-games/) computer with GTX 600/700 series GPU
* Android device running 4.1 (Jelly Bean) or higher
* High-end wireless router (802.11n dual-band recommended)

## Usage

* Turn on GameStream in the GFE settings
* If you are connecting from outside the same network, turn on internet
  streaming
* When on the same network as your PC, open Moonlight and tap on your PC in the list
* Accept the pairing confirmation on your PC
* Tap your PC again to view the list of apps to stream
* Play games!

## Contribute

This project is being actively developed at [XDA Developers](http://forum.xda-developers.com/showthread.php?t=2505510)

1. Fork us
2. Write code
3. Send Pull Requests

## Building
* Install Android Studio and the Android NDK
* Run ‘git submodule update --init --recursive’ from within moonlight-android/
* In moonlight-android/, create a file called ‘local.properties’. Add an ‘ndk.dir=’ property to the local.properties file and set it equal to your NDK directory.
* Build the APK using Android Studio

## Authors

* [Cameron Gutman](https://github.com/cgutman)  
* [Diego Waxemberg](https://github.com/dwaxemberg)  
* [Aaron Neyer](https://github.com/Aaronneyer)  
* [Andrew Hennessy](https://github.com/yetanothername)

Moonlight is the work of students at [Case Western](http://case.edu) and was
started as a project at [MHacks](http://mhacks.org).
