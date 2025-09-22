# ForcePatch

ForcePatch is a lightweight integration mod that extends ForceCraft across popular tech, farming, and automation mods. It adds sensible cross‑mod recipes, tags, data models, and mixins so Force content fits naturally in larger modpacks—without changing ForceCraft’s core balance.

## What changes for players

- Smoother progression: Force items participate in other mods’ machines and systems (mixers, squeezers, planters, data models, etc.).
- More automation paths: New processing routes (e.g., squeezing Force Gems, Bat Claw drops) integrate into existing factories.
- Better discoverability: Common tags ensure Force items work in generic recipes, filters, and storage logic.
- Minimal disruption: No heavy rebalances—just targeted glue so content works together.

## Feature highlights

- Force Block storage (`forcecraft:force_block`) crafted from 9 Force Gems, tagged for compatibility and JEI visibility.
- Cross‑mod recipes and data using modern 1.21 item components where applicable.
- Conditional integrations: features load only when the corresponding mod is present.

## Supported integrations (auto‑enabled if the mod is present)

- **ForceCraft (stock)**
  - Storage block: `forcecraft:force_block` (9 Force Gems; unpack to 9 Gems).
  - Infuser recipe data (e.g., Force Bee) using item components for entity data.
- **Common Tags**
  - Add Force saplings to `c:saplings`.
  - Add Force storage block to `#c:storage_blocks` and `#c:storage_blocks/force`.
- **Bonsai Trees 4**
  - Support for Force trees.
- **Botany Trees**
  - Support for Force trees.
- **Create**
  - Mix Force Gems into Force Fluid.
- **Hostile Neural Networks**
  - Bat Claws drop support on the Bat data model (conditional on mod presence).
- **Immersive Engineering**
  - Squeezer recipe for Force Gems.
- **Mekanism: More Machines**
  - Planter support for Force trees.
- **Mystical Agriculture**
  - Add Force and Bat seeds (applies only if Mystical Agriculture is installed).
- **Integrated Dynamics**
  - Squeezer and Mechanical Squeezer recipes for Force Gems.
- **Productive Bees**
  - Force bees support and data.
- **ProjectE**
  - EMC values for Force Gems and Force Logs.
- **Replication**
  - Matter values for Force Gems and Force Logs.

## Recipes and tags (not exhaustive)

- Storage: 3×3 Force Gems → `forcecraft:force_block` (shaped)
- Unpack: `forcecraft:force_block` → 9 Force Gems (shapeless)
- Tags:
  - Blocks/Items: `#c:storage_blocks` and `#c:storage_blocks/force` include the Force Block
  - Blocks: `c:saplings` includes Force saplings

## Compatibility and requirements

- Minecraft 1.21.1
- NeoForge 21.1+
- Integrations are conditional; if a target mod is missing, its related content will not load.

## Installation

1. Install NeoForge for your Minecraft version.
2. Place `forcepatch-<version>.jar` in the `mods/` folder.
3. Install the mods you want integrated (ForceCraft, Create, Mystical Agriculture, Productive Bees, etc.).
4. Launch. Content for present mods is enabled automatically.

## Troubleshooting

- Missing textures for Force Block:
  - Ensure the texture exists at `assets/forcecraft/textures/block/force_block.png` (the block is registered in the `forcecraft` namespace).
- Recipes not appearing in JEI:
  - Verify recipe JSONs are valid and, if provided by this mod, reside under `data/forcepatch/recipe/` (this mod’s data) or that your pack overrides are correct.
  - Check logs for JSON parse errors; 1.21 result objects typically use `id`/`count` with components when needed.
- Integration not applying:
  - Confirm the target mod is installed and versions match.
  - Mixins only load when the target mod ID is present.

## Planned support

- Mekanism – Force Gas via the Condensentrator (2× output) and conversion back to Force Fluid.
- Woot Revived – Bat Claw support.

## Contributing

PRs for additional integrations, tag improvements, or recipe fixes are welcome. Please keep changes focused, data‑driven where possible, and gated behind mod‑present checks.

## License

MIT


