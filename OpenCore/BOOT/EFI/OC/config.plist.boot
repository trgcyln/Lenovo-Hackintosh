<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
<plist version="1.0">
<dict>
	<key>ACPI</key>
	<dict>
		<key>Add</key>
		<array>
			<dict>
				<key>Enabled</key>
				<true/>
				<key>Comment</key>
				<string>DSDT.aml</string>
				<key>Path</key>
				<string>DSDT.aml</string>
			</dict>
			<dict>
				<key>Enabled</key>
				<true/>
				<key>Comment</key>
				<string>SSDT-EC-USBX-LAPTOP.aml</string>
				<key>Path</key>
				<string>SSDT-EC-USBX-LAPTOP.aml</string>
			</dict>
			<dict>
				<key>Enabled</key>
				<true/>
				<key>Comment</key>
				<string>SSDT-PLUG-DRTNIA.aml</string>
				<key>Path</key>
				<string>SSDT-PLUG-DRTNIA.aml</string>
			</dict>
			<dict>
				<key>Enabled</key>
				<true/>
				<key>Comment</key>
				<string>SSDT-PNLF.aml</string>
				<key>Path</key>
				<string>SSDT-PNLF.aml</string>
			</dict>
		</array>
		<key>Delete</key>
		<array>
			<dict>
				<key>All</key>
				<false/>
				<key>Comment</key>
				<string>Delete CpuPm</string>
				<key>Enabled</key>
				<false/>
				<key>OemTableId</key>
				<data>Q3B1UG0AAAA=</data>
				<key>TableLength</key>
				<integer>0</integer>
				<key>TableSignature</key>
				<data>U1NEVA==</data>
			</dict>
			<dict>
				<key>All</key>
				<false/>
				<key>Comment</key>
				<string>Delete Cpu0Ist</string>
				<key>Enabled</key>
				<false/>
				<key>OemTableId</key>
				<data>Q3B1MElzdAA=</data>
				<key>TableLength</key>
				<integer>0</integer>
				<key>TableSignature</key>
				<data>U1NEVA==</data>
			</dict>
		</array>
		<key>Patch</key>
		<array>
			<dict>
				<key>Comment</key>
				<string>_Q11 to XQ11</string>
				<key>Count</key>
				<integer>1</integer>
				<key>Enabled</key>
				<false/>
				<key>Find</key>
				<data>X1ExMQ==</data>
				<key>Limit</key>
				<integer>0</integer>
				<key>Mask</key>
				<data></data>
				<key>OemTableId</key>
				<data></data>
				<key>Replace</key>
				<data>WFExMQ==</data>
				<key>ReplaceMask</key>
				<data></data>
				<key>Skip</key>
				<integer>0</integer>
				<key>TableLength</key>
				<integer>0</integer>
				<key>TableSignature</key>
				<data></data>
			</dict>
			<dict>
				<key>Comment</key>
				<string>_Q12 to XQ12</string>
				<key>Count</key>
				<integer>1</integer>
				<key>Enabled</key>
				<false/>
				<key>Find</key>
				<data>X1ExMg==</data>
				<key>Limit</key>
				<integer>0</integer>
				<key>Mask</key>
				<data></data>
				<key>OemTableId</key>
				<data></data>
				<key>Replace</key>
				<data>WFExMg==</data>
				<key>ReplaceMask</key>
				<data></data>
				<key>Skip</key>
				<integer>0</integer>
				<key>TableLength</key>
				<integer>0</integer>
				<key>TableSignature</key>
				<data></data>
			</dict>
			<dict>
				<key>Comment</key>
				<string>Change _OSI to XOSI</string>
				<key>Enabled</key>
				<true/>
				<key>Count</key>
				<integer>0</integer>
				<key>Limit</key>
				<integer>0</integer>
				<key>Find</key>
				<data>X09TSQ==</data>
				<key>Replace</key>
				<data>WE9TSQ==</data>
			</dict>
		</array>
		<key>Quirks</key>
		<dict>
			<key>FadtEnableReset</key>
			<false/>
			<key>NormalizeHeaders</key>
			<false/>
			<key>RebaseRegions</key>
			<false/>
			<key>ResetHwSig</key>
			<false/>
			<key>ResetLogoStatus</key>
			<false/>
		</dict>
	</dict>
	<key>Booter</key>
	<dict>
		<key>MmioWhitelist</key>
		<array>
			<dict>
				<key>Address</key>
				<integer>4275159040</integer>
				<key>Comment</key>
				<string>Haswell: SB_RCBA is a 0x4 page memory region, containing SPI_BASE at 0x3800 (SPI_BASE_ADDRESS)</string>
				<key>Enabled</key>
				<false/>
			</dict>
			<dict>
				<key>Address</key>
				<integer>4278190080</integer>
				<key>Comment</key>
				<string>Generic: PCI root is a 0x1000 page memory region used by some firmwares</string>
				<key>Enabled</key>
				<false/>
			</dict>
		</array>
		<key>Quirks</key>
		<dict>
			<key>AvoidRuntimeDefrag</key>
			<true/>
			<key>DevirtualiseMmio</key>
			<false/>
			<key>DisableSingleUser</key>
			<false/>
			<key>DisableVariableWrite</key>
			<false/>
			<key>DiscardHibernateMap</key>
			<false/>
			<key>EnableSafeModeSlide</key>
			<true/>
			<key>EnableWriteUnprotector</key>
			<true/>
			<key>ForceExitBootServices</key>
			<false/>
			<key>ProtectMemoryRegions</key>
			<false/>
			<key>ProtectSecureBoot</key>
			<false/>
			<key>ProtectUefiServices</key>
			<false/>
			<key>ProvideCustomSlide</key>
			<true/>
			<key>ProvideMaxSlide</key>
			<integer>0</integer>
			<key>RebuildAppleMemoryMap</key>
			<false/>
			<key>SetupVirtualMap</key>
			<true/>
			<key>SignalAppleOS</key>
			<false/>
			<key>SyncRuntimePermissions</key>
			<false/>
		</dict>
	</dict>
	<key>DeviceProperties</key>
	<dict>
		<key>Add</key>
		<dict>
			<key>PciRoot(0x0)/Pci(0x2,0x0)</key>
			<dict>
				<key>AAPL,ig-platform-id</key>
				<data>AAAWWQ==</data>
				<key>framebuffer-fbmem</key>
				<data>AAAAAA==</data>
				<key>framebuffer-patch-enable</key>
				<data>AQAAAA==</data>
				<key>framebuffer-stolenmem</key>
				<data>AACIAA==</data>
				<key>framebuffer-unifiedmem</key>
				<data>AAAAYA==</data>
			</dict>
			<key>PciRoot(0x0)/Pci(0x1f,0x3)</key>
			<dict>
				<key>hda-gfx</key>
				<string>onboard-1</string>
				<key>layout-id</key>
				<integer>20</integer>
			</dict>
		</dict>
		<key>Delete</key>
		<dict/>
	</dict>
	<key>Kernel</key>
	<dict>
		<key>Add</key>
		<array>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>Lilu.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/Lilu</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>VirtualSMC.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/VirtualSMC</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>ACPIBatteryManager.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/ACPIBatteryManager</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>AppleALC.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/AppleALC</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>CodecCommander.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/CodecCommander</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>FakePCIID_Intel_HD_Graphics.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string></string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>RealtekRTL8111.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/RealtekRTL8111</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>RtWlanU.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/RtWlanU</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>RtWlanU1827.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/RtWlanU1827</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>SMCLightSensor.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/SMCLightSensor</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>SMCProcessor.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/SMCProcessor</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>SMCSuperIO.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/SMCSuperIO</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>Sinetek-rtsx.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/Sinetek-rtsx</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>USBInjectAll.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/USBInjectAll</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>VoodooI2C.kext/Contents/PlugIns/VoodooGPIO.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/VoodooGPIO</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>VoodooI2C.kext/Contents/PlugIns/VoodooI2CServices.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/VoodooI2CServices</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>VoodooPS2Controller.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/VoodooPS2Controller</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>VoodooPS2Controller.kext/Contents/PlugIns/VoodooPS2Keyboard.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/VoodooPS2Keyboard</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>VoodooPS2Controller.kext/Contents/PlugIns/VoodooPS2Mouse.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/VoodooPS2Mouse</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>VoodooPS2Controller.kext/Contents/PlugIns/VoodooPS2Trackpad.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/VoodooPS2Trackpad</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>VoodooTSCSync.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/VoodooTSCSync</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>WhateverGreen.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/WhateverGreen</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>VoodooI2C.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/VoodooI2C</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>VoodooI2CHID.kext</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<true/>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/VoodooI2CHID</string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
		</array>
		<key>Block</key>
		<array>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>Comment</key>
				<string></string>
				<key>Enabled</key>
				<false/>
				<key>Identifier</key>
				<string>com.apple.driver.AppleTyMCEDriver</string>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
			</dict>
		</array>
		<key>Emulate</key>
		<dict>
			<key>Cpuid1Data</key>
			<data></data>
			<key>Cpuid1Mask</key>
			<data></data>
		</dict>
		<key>Force</key>
		<array>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>BundlePath</key>
				<string>System/Library/Extensions/IONetworkingFamily.kext</string>
				<key>Comment</key>
				<string>Patch engine</string>
				<key>Enabled</key>
				<false/>
				<key>Identifier</key>
				<string>com.apple.iokit.IONetworkingFamily</string>
				<key>ExecutablePath</key>
				<string>Contents/MacOS/IONetworkingFamily</string>
				<key>MaxKernel</key>
				<string>13.99.99</string>
				<key>MinKernel</key>
				<string></string>
				<key>PlistPath</key>
				<string>Contents/Info.plist</string>
			</dict>
		</array>
		<key>Patch</key>
		<array>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>Base</key>
				<string>__ZN8AppleRTC18setupDateTimeAlarmEPK11RTCDateTime</string>
				<key>Comment</key>
				<string>Disable RTC wake scheduling</string>
				<key>Count</key>
				<integer>1</integer>
				<key>Enabled</key>
				<false/>
				<key>Find</key>
				<data></data>
				<key>Identifier</key>
				<string>com.apple.driver.AppleRTC</string>
				<key>Limit</key>
				<integer>0</integer>
				<key>Mask</key>
				<data></data>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string>19.0.0</string>
				<key>Replace</key>
				<data>ww==</data>
				<key>ReplaceMask</key>
				<data></data>
				<key>Skip</key>
				<integer>0</integer>
			</dict>
			<dict>
				<key>Arch</key>
				<string>Any</string>
				<key>Base</key>
				<string>_AcpiOsVprintf</string>
				<key>Comment</key>
				<string>Disable ACPI logging</string>
				<key>Count</key>
				<integer>0</integer>
				<key>Enabled</key>
				<false/>
				<key>Find</key>
				<data></data>
				<key>Identifier</key>
				<string>com.apple.driver.AppleACPIPlatform</string>
				<key>Limit</key>
				<integer>0</integer>
				<key>Mask</key>
				<data></data>
				<key>MaxKernel</key>
				<string>18.5.0</string>
				<key>MinKernel</key>
				<string>18.5.0</string>
				<key>Replace</key>
				<data>ww==</data>
				<key>ReplaceMask</key>
				<data></data>
				<key>Skip</key>
				<integer>0</integer>
			</dict>
			<dict>
				<key>Arch</key>
				<string>x86_64</string>
				<key>Base</key>
				<string>__ZN11BCM5701Enet14getAdapterInfoEv</string>
				<key>Comment</key>
				<string>Broadcom BCM57785 patch</string>
				<key>Count</key>
				<integer>1</integer>
				<key>Enabled</key>
				<false/>
				<key>Find</key>
				<data>6AAA//9miYMABQAA</data>
				<key>Identifier</key>
				<string>com.apple.iokit.AppleBCM5701Ethernet</string>
				<key>Limit</key>
				<integer>0</integer>
				<key>Mask</key>
				<data>/wAA////////////</data>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>Replace</key>
				<data>uLQWAABmiYMABQAA</data>
				<key>ReplaceMask</key>
				<data></data>
				<key>Skip</key>
				<integer>0</integer>
			</dict>
			<dict>
				<key>Arch</key>
				<string>x86_64</string>
				<key>Base</key>
				<string>_panic</string>
				<key>Comment</key>
				<string>Send panic string to serial port</string>
				<key>Count</key>
				<integer>1</integer>
				<key>Enabled</key>
				<false/>
				<key>Find</key>
				<data></data>
				<key>Identifier</key>
				<string>kernel</string>
				<key>Limit</key>
				<integer>0</integer>
				<key>Mask</key>
				<data></data>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>Replace</key>
				<data>MduKD4TJdQT/w7EKZrr9A+yoIHT7Zrr4A4jI7kj/x4XbdN/r/g==</data>
				<key>ReplaceMask</key>
				<data></data>
				<key>Skip</key>
				<integer>0</integer>
			</dict>
			<dict>
				<key>Arch</key>
				<string>x86_64</string>
				<key>Base</key>
				<string>_kernel_debug_string_early</string>
				<key>Comment</key>
				<string>Send early prints to serial port</string>
				<key>Count</key>
				<integer>1</integer>
				<key>Enabled</key>
				<false/>
				<key>Find</key>
				<data></data>
				<key>Identifier</key>
				<string>kernel</string>
				<key>Limit</key>
				<integer>0</integer>
				<key>Mask</key>
				<data></data>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>Replace</key>
				<data>MduKD4TJdQT/w7EKZrr9A+yoIHT7Zrr4A4jI7kj/x4XbdN/D</data>
				<key>ReplaceMask</key>
				<data></data>
				<key>Skip</key>
				<integer>0</integer>
			</dict>
			<dict>
				<key>Arch</key>
				<string>x86_64</string>
				<key>Base</key>
				<string>_vstart</string>
				<key>Comment</key>
				<string>Print K and dead loop</string>
				<key>Count</key>
				<integer>1</integer>
				<key>Enabled</key>
				<false/>
				<key>Find</key>
				<data></data>
				<key>Identifier</key>
				<string>kernel</string>
				<key>Limit</key>
				<integer>0</integer>
				<key>Mask</key>
				<data></data>
				<key>MaxKernel</key>
				<string></string>
				<key>MinKernel</key>
				<string></string>
				<key>Replace</key>
				<data>sUtmuv0D7KggdPtmuvgDiMjusQpmuv0D7KggdPtmuvgDiMju6/4=</data>
				<key>ReplaceMask</key>
				<data></data>
				<key>Skip</key>
				<integer>0</integer>
			</dict>
		</array>
		<key>Quirks</key>
		<dict>
			<key>AppleCpuPmCfgLock</key>
			<true/>
			<key>AppleXcpmCfgLock</key>
			<true/>
			<key>AppleXcpmExtraMsrs</key>
			<false/>
			<key>AppleXcpmForceBoost</key>
			<false/>
			<key>CustomSMBIOSGuid</key>
			<false/>
			<key>DisableIoMapper</key>
			<true/>
			<key>DisableLinkeditJettison</key>
			<true/>
			<key>DisableRtcChecksum</key>
			<false/>
			<key>DummyPowerManagement</key>
			<false/>
			<key>ExternalDiskIcons</key>
			<false/>
			<key>IncreasePciBarSize</key>
			<false/>
			<key>LapicKernelPanic</key>
			<false/>
			<key>PanicNoKextDump</key>
			<true/>
			<key>PowerTimeoutKernelPanic</key>
			<true/>
			<key>ThirdPartyDrives</key>
			<false/>
			<key>XhciPortLimit</key>
			<true/>
		</dict>
		<key>Scheme</key>
		<dict>
			<key>FuzzyMatch</key>
			<true/>
			<key>KernelArch</key>
			<string>x86_64</string>
			<key>KernelCache</key>
			<string>Auto</string>
		</dict>
	</dict>
	<key>Misc</key>
	<dict>
		<key>BlessOverride</key>
		<array/>
		<key>Boot</key>
		<dict>
			<key>ConsoleAttributes</key>
			<integer>0</integer>
			<key>HibernateMode</key>
			<string>None</string>
			<key>HideAuxiliary</key>
			<false/>
			<key>PickerAttributes</key>
			<integer>1</integer>
			<key>PickerAudioAssist</key>
			<false/>
			<key>PickerMode</key>
			<string>Builtin</string>
			<key>PollAppleHotKeys</key>
			<false/>
			<key>ShowPicker</key>
			<true/>
			<key>TakeoffDelay</key>
			<integer>0</integer>
			<key>Timeout</key>
			<integer>5</integer>
		</dict>
		<key>Debug</key>
		<dict>
			<key>AppleDebug</key>
			<true/>
			<key>ApplePanic</key>
			<true/>
			<key>DisableWatchDog</key>
			<false/>
			<key>DisplayDelay</key>
			<integer>0</integer>
			<key>DisplayLevel</key>
			<integer>2147483650</integer>
			<key>SerialInit</key>
			<false/>
			<key>SysReport</key>
			<false/>
			<key>Target</key>
			<integer>67</integer>
		</dict>
		<key>Entries</key>
		<array>
			<dict>
				<key>Arguments</key>
				<string></string>
				<key>Auxiliary</key>
				<false/>
				<key>Comment</key>
				<string>Not signed for security reasons</string>
				<key>Enabled</key>
				<false/>
				<key>Name</key>
				<string>CustomOS</string>
				<key>Path</key>
				<string>PciRoot(0x0)/Pci(0x1,0x1)/Pci(0x0,0x0)/NVMe(0x1,11-22-33-44-55-66-77-88)/HD(1,GPT,00000000-0000-0000-0000-000000000000,0x800,0x64000)/\EFI\BOOT\BOOTX64.EFI</string>
			</dict>
		</array>
		<key>Security</key>
		<dict>
			<key>AllowNvramReset</key>
			<true/>
			<key>AllowSetDefault</key>
			<true/>
			<key>ApECID</key>
			<integer>0</integer>
			<key>AuthRestart</key>
			<false/>
			<key>BootProtect</key>
			<string>Bootstrap</string>
			<key>DmgLoading</key>
			<string>Signed</string>
			<key>EnablePassword</key>
			<false/>
			<key>ExposeSensitiveData</key>
			<integer>6</integer>
			<key>HaltLevel</key>
			<integer>2147483648</integer>
			<key>PasswordHash</key>
			<data></data>
			<key>PasswordSalt</key>
			<data></data>
			<key>ScanPolicy</key>
			<integer>0</integer>
			<key>SecureBootModel</key>
			<string>Default</string>
			<key>Vault</key>
			<string>Optional</string>
		</dict>
		<key>Tools</key>
		<array>
			<dict>
				<key>Arguments</key>
				<string></string>
				<key>Auxiliary</key>
				<true/>
				<key>Name</key>
				<string>OpenShell.efi</string>
				<key>Comment</key>
				<string>OpenShell.efi</string>
				<key>Enabled</key>
				<true/>
				<key>Path</key>
				<string>OpenShell.efi</string>
			</dict>
		</array>
	</dict>
	<key>NVRAM</key>
	<dict>
		<key>Add</key>
		<dict>
			<key>4D1EDE05-38C7-4A6A-9CC6-4BCCA8B38C14</key>
			<dict>
				<key>DefaultBackgroundColor</key>
				<data>AAAAAA==</data>
				<key>UIScale</key>
				<data>AQ==</data>
			</dict>
			<key>4D1FDA02-38C7-4A6A-9CC6-4BCCA8B30102</key>
			<dict>
				<key>rtc-blacklist</key>
				<data></data>
			</dict>
			<key>7C436110-AB2A-4BBB-A880-FE41995C9F82</key>
			<dict>
				<key>SystemAudioVolume</key>
				<data>Rg==</data>
				<key>boot-args</key>
				<string>alcid=3 keepsyms=1 debug=0x100 -wegnoegpu -disablegfxfirmware</string>
				<key>run-efi-updater</key>
				<string>No</string>
				<key>csr-active-config</key>
				<data>AAAAAA==</data>
				<key>prev-lang:kbd</key>
				<string>en-US:0
</string>
			</dict>
		</dict>
		<key>Delete</key>
		<dict>
			<key>4D1EDE05-38C7-4A6A-9CC6-4BCCA8B38C14</key>
			<array>
				<string>UIScale</string>
				<string>DefaultBackgroundColor</string>
			</array>
			<key>4D1FDA02-38C7-4A6A-9CC6-4BCCA8B30102</key>
			<array>
				<string>rtc-blacklist</string>
			</array>
			<key>7C436110-AB2A-4BBB-A880-FE41995C9F82</key>
			<array>
				<string>boot-args</string>
			</array>
		</dict>
		<key>LegacyEnable</key>
		<false/>
		<key>LegacyOverwrite</key>
		<false/>
		<key>LegacySchema</key>
		<dict>
			<key>7C436110-AB2A-4BBB-A880-FE41995C9F82</key>
			<array>
				<string>EFILoginHiDPI</string>
				<string>EFIBluetoothDelay</string>
				<string>LocationServicesEnabled</string>
				<string>SystemAudioVolume</string>
				<string>SystemAudioVolumeDB</string>
				<string>SystemAudioVolumeSaved</string>
				<string>bluetoothActiveControllerInfo</string>
				<string>bluetoothInternalControllerInfo</string>
				<string>flagstate</string>
				<string>fmm-computer-name</string>
				<string>nvda_drv</string>
				<string>prev-lang:kbd</string>
			</array>
			<key>8BE4DF61-93CA-11D2-AA0D-00E098032B8C</key>
			<array>
				<string>Boot0080</string>
				<string>Boot0081</string>
				<string>Boot0082</string>
				<string>BootNext</string>
				<string>BootOrder</string>
			</array>
		</dict>
		<key>WriteFlash</key>
		<true/>
	</dict>
	<key>PlatformInfo</key>
	<dict>
		<key>Automatic</key>
		<true/>
		<key>Generic</key>
		<dict>
			<key>AdviseWindows</key>
			<false/>
			<key>MLB</key>
			<string>C027054054NHRPCFB</string>
			<key>ROM</key>
			<data>ESIzRFVm</data>
			<key>SpoofVendor</key>
			<true/>
			<key>SystemProductName</key>
			<string>MacBookPro14,2</string>
			<key>SystemSerialNumber</key>
			<string>C02T60QPHV2N</string>
			<key>SystemUUID</key>
			<string>D103C0BC-AA85-4394-80AB-415F6C1C4DF8</string>
		</dict>
		<key>UpdateDataHub</key>
		<true/>
		<key>UpdateNVRAM</key>
		<true/>
		<key>UpdateSMBIOS</key>
		<true/>
		<key>UpdateSMBIOSMode</key>
		<string>Create</string>
	</dict>
	<key>UEFI</key>
	<dict>
		<key>APFS</key>
		<dict>
			<key>EnableJumpstart</key>
			<true/>
			<key>GlobalConnect</key>
			<false/>
			<key>HideVerbose</key>
			<true/>
			<key>JumpstartHotPlug</key>
			<false/>
			<key>MinDate</key>
			<integer>0</integer>
			<key>MinVersion</key>
			<integer>0</integer>
		</dict>
		<key>ConnectDrivers</key>
		<true/>
		<key>Drivers</key>
		<array>
			<string>HfsPlus.efi</string>
			<string>OpenRuntime.efi</string>
		</array>
		<key>Input</key>
		<dict>
			<key>KeyFiltering</key>
			<false/>
			<key>KeyForgetThreshold</key>
			<integer>5</integer>
			<key>KeyMergeThreshold</key>
			<integer>2</integer>
			<key>KeySupport</key>
			<true/>
			<key>KeySupportMode</key>
			<string>Auto</string>
			<key>KeySwap</key>
			<false/>
			<key>PointerSupport</key>
			<false/>
			<key>PointerSupportMode</key>
			<string>ASUS</string>
			<key>TimerResolution</key>
			<integer>50000</integer>
		</dict>
		<key>Output</key>
		<dict>
			<key>ClearScreenOnModeSwitch</key>
			<false/>
			<key>ConsoleMode</key>
			<string></string>
			<key>DirectGopRendering</key>
			<false/>
			<key>IgnoreTextInGraphics</key>
			<false/>
			<key>ProvideConsoleGop</key>
			<true/>
			<key>ReconnectOnResChange</key>
			<false/>
			<key>ReplaceTabWithSpace</key>
			<false/>
			<key>Resolution</key>
			<string>Max</string>
			<key>SanitiseClearScreen</key>
			<false/>
			<key>TextRenderer</key>
			<string>BuiltinGraphics</string>
			<key>UgaPassThrough</key>
			<false/>
		</dict>
		<key>ProtocolOverrides</key>
		<dict>
			<key>AppleAudio</key>
			<true/>
			<key>AppleBootPolicy</key>
			<false/>
			<key>AppleDebugLog</key>
			<false/>
			<key>AppleEvent</key>
			<false/>
			<key>AppleFramebufferInfo</key>
			<false/>
			<key>AppleImageConversion</key>
			<false/>
			<key>AppleImg4Verification</key>
			<false/>
			<key>AppleKeyMap</key>
			<false/>
			<key>AppleRtcRam</key>
			<false/>
			<key>AppleSecureBoot</key>
			<false/>
			<key>AppleSmcIo</key>
			<false/>
			<key>AppleUserInterfaceTheme</key>
			<false/>
			<key>DataHub</key>
			<false/>
			<key>DeviceProperties</key>
			<false/>
			<key>FirmwareVolume</key>
			<false/>
			<key>HashServices</key>
			<false/>
			<key>OSInfo</key>
			<false/>
			<key>UnicodeCollation</key>
			<false/>
		</dict>
		<key>Quirks</key>
		<dict>
			<key>DeduplicateBootOrder</key>
			<true/>
			<key>ExitBootServicesDelay</key>
			<integer>0</integer>
			<key>IgnoreInvalidFlexRatio</key>
			<false/>
			<key>ReleaseUsbOwnership</key>
			<true/>
			<key>RequestBootVarRouting</key>
			<true/>
			<key>TscSyncTimeout</key>
			<integer>0</integer>
			<key>UnblockFsConnect</key>
			<false/>
		</dict>
		<key>ReservedMemory</key>
		<array>
			<dict>
				<key>Address</key>
				<integer>268435456</integer>
				<key>Comment</key>
				<string>HD3000: IGPU memory corruption errata</string>
				<key>Enabled</key>
				<false/>
				<key>Size</key>
				<integer>268435456</integer>
			</dict>
		</array>
	</dict>
</dict>
</plist>