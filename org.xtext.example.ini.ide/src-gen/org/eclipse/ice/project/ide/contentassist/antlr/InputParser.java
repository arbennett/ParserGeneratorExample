/*
 * generated by Xtext 2.9.1
 */
package org.eclipse.ice.project.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.ice.project.ide.contentassist.antlr.internal.InternalInputParser;
import org.eclipse.ice.project.services.InputGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class InputParser extends AbstractContentAssistParser {

	@Inject
	private InputGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalInputParser createParser() {
		InternalInputParser result = new InternalInputParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
					put(grammarAccess.getSectionAccess().getGroup(), "rule__Section__Group__0");
					put(grammarAccess.getSectionAccess().getGroup_3(), "rule__Section__Group_3__0");
					put(grammarAccess.getLineAccess().getGroup(), "rule__Line__Group__0");
					put(grammarAccess.getInputAccess().getSectionsAssignment_2(), "rule__Input__SectionsAssignment_2");
					put(grammarAccess.getSectionAccess().getNameAssignment_1(), "rule__Section__NameAssignment_1");
					put(grammarAccess.getSectionAccess().getLinesAssignment_3_1(), "rule__Section__LinesAssignment_3_1");
					put(grammarAccess.getLineAccess().getNameAssignment_1(), "rule__Line__NameAssignment_1");
					put(grammarAccess.getLineAccess().getValueAssignment_3(), "rule__Line__ValueAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalInputParser typedParser = (InternalInputParser) parser;
			typedParser.entryRuleInput();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_COMMENT", "RULE_WHITESPACE" };
	}

	public InputGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(InputGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}