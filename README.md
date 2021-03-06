# Fluid Physics (Minecraft Mod)
[![Build Workflow](https://github.com/LolHens/mc-fluid-physics/workflows/build/badge.svg)](https://github.com/LolHens/mc-fluid-physics/actions?query=workflow%3Abuild)
[![Release Notes](https://img.shields.io/github/release/LolHens/mc-fluid-physics.svg?maxAge=3600)](https://github.com/LolHens/mc-fluid-physics/releases/latest)
[![Apache License 2.0](https://img.shields.io/github/license/LolHens/mc-fluid-physics.svg?maxAge=3600)](https://www.apache.org/licenses/LICENSE-2.0)

[![](https://raw.githubusercontent.com/LolHens/mc-fluid-physics/master/fabric-1.16.2/src/main/resources/assets/fluidphysics/icon.png)](https://www.curseforge.com/minecraft/mc-mods/fluid-physics)

This mod blends together vanilla fluid mechanics with something a little more realistic plus some small additions.
Fluids flowing horizontally will not be affected by this mod. Fluids flowing down will take the source with them.
This is intentionally not a realistic fluid simulation in order to not break too much of the vanilla gameplay.
If you want something more realistic look in the "Similar mods" section down below.

## Features
- Fluid source blocks can flow down
- Removes infinite water sources (not a good idea with this mod)
- Pistons can pump fluids
- Spring blocks generate under naturally generated springs and prevent them from flowing down
- Rain refills lakes and oceans (similar to infinite water sources in vanilla)
- Works with vanilla clients (you have to set the config option spring/block to a vanilla block like 'mossy_cobblestone')

## Requirements
### [Fabric](https://fabricmc.net/)
[<img src="https://fabricmc.net/assets/logo.png" width="32"> Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api)

[<img src="https://user-images.githubusercontent.com/1524059/88789314-e5dd3300-d196-11ea-99dc-2399393ef409.png" width="32"> Fabric Language Scala](https://www.curseforge.com/minecraft/mc-mods/fabric-language-scala)

### [Forge](https://files.minecraftforge.net/)
[<img src="https://avatars2.githubusercontent.com/u/1390178" width="32"> Minecraft Forge](https://files.minecraftforge.net/)

[<img src="https://user-images.githubusercontent.com/1524059/91673183-2849b500-eb33-11ea-8f9d-3d486f266000.png" width="32"> Scalable Cat's Force](https://www.curseforge.com/minecraft/mc-mods/scalable-cats-force)

[<img src="https://user-images.githubusercontent.com/1524059/94992271-30a96b80-0589-11eb-8fcd-b6c8ed66ad32.png" width="32"> MixinBootstrap](https://www.curseforge.com/minecraft/mc-mods/mixinbootstrap) (only required on 1.15.2)

## Screenshots
![](https://raw.githubusercontent.com/LolHens/mc-fluid-physics/master/screenshots/2020-07-07_00.22.08.png)
![](https://raw.githubusercontent.com/LolHens/mc-fluid-physics/master/screenshots/2020-07-07_01.09.31.png)

## Videos
[![](https://img.youtube.com/vi/ruu0PwRRzL8/0.jpg)](https://www.youtube.com/watch?v=ruu0PwRRzL8)

## Known issues
- Under some circumstances fluids can stop flowing (This is why in the video I have the glass block slowing down the water flowing into the sandstone tank)
- There were issues reported when using this mod on 1.16.5 together with ForgeEndertech and Optifine or GraalVM. Please upgrade to Optifine G8 or use another JVM.

## Older versions
These are the previous iterations of this mod:
- https://github.com/LolHens/Minechanics-water-1.7.10
- https://github.com/LolHens/Minechanics

## Similar mods
If you are looking for a similar mod for fabric with more realism have a look at [Dihydrogen Monoxide Reloaded by CoolMineman](https://www.curseforge.com/minecraft/mc-mods/dihydrogen-monoxide-reloaded)

Also there is the similarly realistic forge mod [PhysEx](https://www.curseforge.com/minecraft/mc-mods/physex)

## License
This project uses the Apache 2.0 License. See the file called LICENSE.
