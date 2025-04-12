package vip.cdms.incrafter.cli

import com.github.ajalt.clikt.core.main
import org.luaj.vm2.Globals
import org.luaj.vm2.LoadState
import org.luaj.vm2.compiler.LuaC
import org.luaj.vm2.lib.*

fun main(args: Array<String>) = InCrafterCli().main(args)
