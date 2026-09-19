# FactoryMax

A Minecraft mod project in active development, inspired by the feel of large-scale industrial automation and GregTech-style progression.

FactoryMax is being built as a NeoForge mod for Minecraft, with a focus on resource processing, automation, and scalable factory gameplay.

## Status

This project is currently in early development. The codebase is being structured as a real mod project, and the README is being expanded as the mod grows.

## Project Goals

- Build a tech-mod progression loop
- Add industrial resource processing and automation
- Create a factory-oriented gameplay experience in Minecraft
- Target NeoForge-compatible Minecraft versions
- Keep the mod extensible and maintainable

## Current State

This repository contains a NeoForge mod setup using Gradle and MCreator-generated project structure. The project is not yet a finished release and should be considered a work in progress.

## Requirements

- Java 25 (recommended for this project toolchain)
- NeoForge-compatible Minecraft environment
- Gradle wrapper included in the repo

## Getting Started

### Clone the repository

```bash
git clone https://github.com/highiqmike1-prog/factorymax.git
cd factorymax
```

### Build the mod

```bash
./gradlew build
```

On Windows:

```powershell
gradlew.bat build
```

The compiled mod artifact will be generated in the `build/libs` directory.

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
├── README.md
└── .gitignore
```

## Development Notes

- The project uses Gradle with the NeoForge mod development plugin.
- The mod ID is `factorymax`.
- The project includes MCreator-generated source layout and configuration files.
- The repository is intended to evolve into a custom tech mod rather than a purely generated template.

## Contributing

Contributions are welcome as the mod develops. If you want to help:

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Open a pull request with a clear summary of what changed

## License

No license has been declared for this project yet. If you plan to distribute or use it publicly, please check the repository settings and add an appropriate license before release.

## Contact

For questions, suggestions, or collaboration:

- GitHub: https://github.com/highiqmike1-prog/factorymax

## Important Note

This project is a work in progress. Features, compatibility, and project structure may change significantly as development continues.

---

If you want, I can also make this README more polished for a public audience with:

- a feature roadmap section
- screenshots placeholder area
- install instructions for Modrinth/CurseForge
- a contributor section
- badges and a better project header
