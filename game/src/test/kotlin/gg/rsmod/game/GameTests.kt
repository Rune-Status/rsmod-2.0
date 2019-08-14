package gg.rsmod.game

import com.google.inject.Guice
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GameTests {

    @Test
    fun `construct with dependency injection`() {
        val module = TestModule()
        val guice = Guice.createInjector(module)

        val game = guice.getInstance(Game::class.java)
        assertNotNull(game)
    }
}