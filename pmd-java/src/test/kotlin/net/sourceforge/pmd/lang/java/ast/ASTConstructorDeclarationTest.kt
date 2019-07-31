/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.ast

import net.sourceforge.pmd.lang.ast.test.shouldBe
import net.sourceforge.pmd.lang.java.typeresolution.MethodTypeResolution.getArity

class ASTConstructorDeclarationTest : ParserTestSpec({

    parserTest("Receiver parameters") {

        "Foo(@A Foo this){}" should matchDeclaration<ASTConstructorDeclaration> {
            it::getName shouldBe "Foo"
            it::getTypeParameters shouldBe null
            it::isVarargs shouldBe false
            // notice that arity is zero
            it::getArity shouldBe 0

            it::getFormalParameters shouldBe child {
                it::getParameterCount shouldBe 0
                it::toList shouldBe emptyList()

                it::getReceiverParameter shouldBe child {
                    classType("Foo") {
                        annotation("A")
                    }
                }

            }

            it::getThrows shouldBe null
            it::getBody shouldBe block()
        }

        "Foo(@A Bar Bar.this, int other){}" should matchDeclaration<ASTConstructorDeclaration> {
            it::getName shouldBe "Foo"
            it::getTypeParameters shouldBe null
            it::isVarargs shouldBe false
            it::getArity shouldBe 1

            it::getFormalParameters shouldBe child {
                it::getParameterCount shouldBe 1

                it::getReceiverParameter shouldBe child {
                    classType("Bar") {
                        annotation("A")
                    }
                }

                it::toList shouldBe listOf(
                        child {
                            primitiveType(ASTPrimitiveType.PrimitiveType.INT)
                            variableId("other")
                        }
                )


            }

            it::getThrows shouldBe null
            it::getBody shouldBe block()
        }
    }

    parserTest("Annotation placement") {

        "@OnDecl <T extends K> Foo() { return; }" should matchDeclaration<ASTConstructorDeclaration> {

            it::getName shouldBe "Foo"

            annotation("OnDecl")

            typeParamList {
                typeParam("T") {
                    classType("K")
                }
            }

            child<ASTFormalParameters> {

            }

            block()
        }
    }
})
