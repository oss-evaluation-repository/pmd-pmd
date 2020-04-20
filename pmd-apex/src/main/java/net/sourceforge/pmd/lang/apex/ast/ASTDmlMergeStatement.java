/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.statement.DmlMergeStatement;

public final class ASTDmlMergeStatement extends AbstractApexNode<DmlMergeStatement> {

    ASTDmlMergeStatement(DmlMergeStatement dmlMergeStatement) {
        super(dmlMergeStatement);
    }

    @Override
    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
