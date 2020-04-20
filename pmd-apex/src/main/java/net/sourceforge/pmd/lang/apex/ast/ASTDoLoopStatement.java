/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.statement.DoLoopStatement;

public final class ASTDoLoopStatement extends AbstractApexNode<DoLoopStatement> {

    ASTDoLoopStatement(DoLoopStatement doLoopStatement) {
        super(doLoopStatement);
    }

    @Override
    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
