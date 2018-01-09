package com.github.kornilova_l.matlab.parser

import com.github.kornilova_l.matlab.MatlabParserDefinition
import com.intellij.testFramework.ParsingTestCase

open class MatlabParserTest : ParsingTestCase("", "m", MatlabParserDefinition()) {

    override fun getTestDataPath(): String {
        return "src/test/resources/parser"
    }

    override fun includeRanges(): Boolean {
        return true
    }

    fun testValidNumbers() {
        doTest(true)
    }

    fun testValidLoad() {
        doTest(true)
    }

    fun testValidWhile() {
        doTest(true)
    }
}