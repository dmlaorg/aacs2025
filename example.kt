//A rule that produces an AST element
//Customizing/extending the generated token matcher that matches a single string literal token
@ASTElement
class StringLiteralRule() : TM_STRING {

    override fun tryMatchInternal(from: Int, context: ParserContext, breakOnFirst: Boolean): GrammarRuleMatchResult {
        //Calling the super matcher is optional
        //This returns the matched literal, or a failure
        var literal = super.tryMatchInternal(from, context, breakOnFirst)
        //The custom logic goes here
        return literal
    }

}