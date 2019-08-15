package gg.rsmod.game.plugin.kotlinscript

import gg.rsmod.game.plugin.Plugin
import kotlin.script.experimental.annotations.KotlinScript

/**
 * A [Plugin] used as representation for KotlinScript plugin files.
 *
 * @author Tom
 */
@KotlinScript(
    displayName = "KotlinScript Plugin",
    fileExtension = "plugin.kts"
)
abstract class KotlinPlugin : Plugin()