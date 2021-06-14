# alien banking trojan deobfuscated source

## DISCLAIMER: This repository is only for educational purposes and researchers. You should never use this trojans' source to do anything illegal or harmful. This source is published only to help researchers and antivirus developers. I have nothing to do with anything made with these repository's contents and I'm not responsible for anything made using these repository's contents. I have only reverse-engineered this trojan to help researchers and antivirus developers and I'm not the owner of any of the sources published in this repository.


as everyone knows, alien is a thing and i thought it was something really different from [Cerberus](https://en.wikipedia.org/wiki/Cerberus_(Android)) but looks like alien is nothing more than cerberus expect some additional shit for xiaomi devices...

## your shit is funny ring0

pretty sure the guy who made this shit is someone called "ring0" (who is nothing more than a skid), as seen on the code (looks like he didn't even ment to hide it). he is selling this for thousands afaik and i cant believe how ugly this shit is.. like the string encryption, why would you ever use such a awful (its actually pointless) encryption ? and he also thinks proguard is a layer of obfuscation that is too funny too. also if we come to the "loader"; there's no point of it since all it does is decrypting the apk from assets and putting the decrypted version of it obviously to the data directory of the app and loading the classes from the data dir of the app using [DexClassLoader](https://developer.android.com/reference/dalvik/system/DexClassLoader) and it is too easy to browse the data dir of the app and grab the JSON from there..

- Obtained the original APK which is masked as a JSON file in app's data directory
- Converted classes.dex inside the APK to JAR with [dex2jar](https://github.com/pxb1988/dex2jar)
- Reobfuscated classes, fields, methods and cleaned up the code with [Threadtear](https://github.com/GraxCode/threadtear)
- Decrypted constants that are encrypted with RC4 and also inlined the usages of them with a simple cli app by the help of some modified [ASM](https://en.wikipedia.org/wiki/ObjectWeb_ASM)
- Manually remapped classes, some fields and methods identically to the Cerberus' code structure (both are same) with [JRemapper](https://github.com/Col-E/JRemapper) and [Recaf](https://github.com/Col-E/Recaf)
- Fixed some broken bytecode with [JByteMod-Reborn](https://github.com/DotRacel/JByteMod-Reborn)
- Decompiled the deobfuscated JAR with [CFR](https://www.benf.org/other/cfr/), [Fernflower](https://github.com/fesh0r/fernflower) and [Procyon](https://github.com/ststeiger/procyon)

## i may come back with a cleaner source soon, enjoy :')