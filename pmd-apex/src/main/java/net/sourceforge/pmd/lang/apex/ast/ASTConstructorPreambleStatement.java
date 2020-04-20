/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.statement.ConstructorPreambleStatement;

public final class ASTConstructorPreambleStatement extends AbstractApexNode<ConstructorPreambleStatement> {

    ASTConstructorPreambleStatement(ConstructorPreambleStatement constructorPreambleStatement) {
        super(constructorPreambleStatement);
    }

    @Override
    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
