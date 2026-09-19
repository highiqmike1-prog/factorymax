# FactoryMax

FactoryMax is a Minecraft technology and automation mod for NeoForge. It is designed around resource processing, industrial automation, scalable factories, and long-term progression.

> **Project status:** FactoryMax is in active early development. Features, mechanics, compatibility, and release plans may change.

## Features and Goals

- Industrial resource processing
- Automation and factory-building systems
- A technology-focused progression path
- Scalable machines and production chains
- Compatibility with NeoForge-based Minecraft modpacks
- An extensible foundation for future content and optional add-ons

## Development Status

This repository currently contains the NeoForge project setup and early FactoryMax development work. It is not yet a finished public release.

## Requirements

- Java 25
- NeoForge `26.1.2.95` or a compatible version specified by the release
- Minecraft `26.1.2` or the version specified by the release
- The Gradle wrapper included in this repository

## Building from Source

Clone the repository:

```bash
git clone https://github.com/highiqmike1-prog/factorymax.git
cd factorymax
```

Build the mod:

```bash
./gradlew build
```

On Windows:

```powershell
gradlew.bat build
```

The built artifact will be placed in `build/libs`.

## Project Structure

```text
factorymax/
├── .github/
│   └── workflows/
├── gradle/
├── src/
│   └── main/
│       ├── java/
│       └── resources/
├── build.gradle
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
├── factorymax.mcreator
└── README.md
```

## Add-ons and Community Content

FactoryMax may support community-made add-ons in the future. Add-ons are welcome only when they follow these rules:

- They must not include or redistribute FactoryMax source code, assets, binaries, textures, models, sounds, or other proprietary content without written permission.
- They must not use the FactoryMax name, logo, or branding in a way that suggests official endorsement without permission.
- They must clearly state that they are unofficial and are not created, approved, or supported by the FactoryMax author.
- They must not bundle, re-upload, or mirror the FactoryMax mod itself.
- Monetized add-ons require written permission before release.

The author may grant separate permissions for specific add-ons or integrations. Contact the author before publishing an add-on that depends on or interacts with FactoryMax.

## Contributions

FactoryMax is primarily maintained as a proprietary project. Pull requests and suggestions may be accepted at the author's discretion, but submitting a contribution does not grant permission to copy, redistribute, relicense, or commercially exploit the FactoryMax project.

Before contributing substantial work, please open an issue or contact the author to discuss the intended change and licensing terms.

## Copyright and License

Copyright © 2026 highiqmike1-prog. All rights reserved.

**License identifier:** `Proprietary - All Rights Reserved`

FactoryMax is **not open source** and is not licensed under the MIT, Apache-2.0, GPL, LGPL, or any other permissive or open-source license. No permission is granted to copy, modify, publish, distribute, sublicense, sell, monetize, re-upload, or create derivative works from this project except where the copyright holder gives written permission.

You may view this repository on GitHub for personal evaluation and development reference. Viewing the code does not grant permission to redistribute it or use it in another project.

The FactoryMax name, logo, original code, assets, data, documentation, and other project content remain the property of the copyright holder unless explicitly stated otherwise.

> This notice is intended to communicate the project's licensing terms. It is not a substitute for legal advice. If you plan to monetize FactoryMax or enforce these rights, consult a qualified attorney about the appropriate license and distribution strategy.

## Contact

For licensing, add-on, commercial, or collaboration requests, open an issue in this repository or contact the project owner through GitHub:

https://github.com/highiqmike1-prog/factorymax

## Important Notice

Unauthorized copying, redistribution, re-uploading, modification, monetization, or use of FactoryMax content in another project is prohibited unless explicitly authorized in writing by the copyright holder.
