# Lenovo-Hackintosh


# Catalina 10.15.3
##### Hackintosh Clover Configuration for Ideapad 510-15IKB

## Specifications
2.71 GHz Intel Core i5 7200U , Intel HD Graphics 620, 8 GB 2133 MHz DDR4 Memory, Kingston SSDNow UV500 480GB

##  Screenshot

![alt text](https://raw.githubusercontent.com/trgcyln/Lenovo-Hackintosh/master/Screenshot.png)
![alt text](https://raw.githubusercontent.com/trgcyln/Lenovo-Hackintosh/master/Screenshot-2.png)

## BIOS Settings (Latest BIOS from Offical Lenovo)
Wireless LAN [Enabled]
Graphic Device [Discrete]
Power Beep [Disabled]
Intel Virtualization Technology [Enabled]
BIOS Back Flash [Enabled]
Hotkey Mode [Disabled]
Intel Platform Trust Technology [Enabled]
Intel SGX [Software Controlled]
Secure Boot [Disabled]
Boot Mode [UEFI]
Fast Boot [Disabled]
USB Boot [Enabled]
PXE Boot to LAN [Enabled]
IPV4 PXE First [Enabled]

## Installation
1. Install Clover to your macOS Drive
2. Install [DSDT Patches](https://github.com/trgcyln/Lenovo-Hackintosh/tree/master/DSDT_Patches) using MaciASL
3. Copy Kexts/Other to S/L/E
4. Rebuild cache

## Working
1. FN + F1/F2/F3/F6/F11/F12
2. HD Graphics 620
3. Sound
4. TouchPad with Multi-Gesture
5. Power Management & Battery Status
6. Brightness

## Not Working
1. Wireless Card
2. SD Card Reader

## Solution for Wireless Card & SD Card
1. [Asus USB-N10 NANO](https://www.asus.com/Networking/USBN10_NANO/)
2. [BLUEENDLESS Type C to 3*USB 3.0/SD/TF Card Reader](https://tr.banggood.com/Blueendless-HC401-9-in-1-Type-C-to-3-Port-USB-3_0-HDMI-SD-TF-Card-Reader-Data-Hub-p-1555789.html?cur_warehouse=CN) + USB Type C to USB 3.0 Converter



## Important Note
If you've got exactly same Laptop model, you can just simply use the EFI folder above.
