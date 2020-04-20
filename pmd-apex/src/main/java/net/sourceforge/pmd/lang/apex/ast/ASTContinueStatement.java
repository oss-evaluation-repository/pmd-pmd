/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.statement.ContinueStatement;

public final class ASTContinueStatement extends AbstractApexNode<ContinueStatement> {

    ASTContinueStatement(ContinueStatement continueStatement) {
        super(continueStatement);
    }

    @Override
    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
