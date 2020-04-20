/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.expression.JavaMethodCallExpression;

public final class ASTJavaMethodCallExpression extends AbstractApexNode<JavaMethodCallExpression> {

    ASTJavaMethodCallExpression(JavaMethodCallExpression javaMethodCallExpression) {
        super(javaMethodCallExpression);
    }

    @Override
    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
