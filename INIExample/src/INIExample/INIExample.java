package INIExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.ice.project.InputStandaloneSetupGenerated;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.ParseException;

import org.eclipse.ice.project.project.impl.SectionImpl;
import org.eclipse.ice.project.project.impl.LineImpl;


import com.google.inject.Inject;
import com.google.inject.Injector;

public class INIExample {

	// Make the thing run
	public static void main(String[] args) {
		INIExample i = new INIExample();
		FileReader r;
		try {
			r = new FileReader(new File("./src/testfile.ini"));
			INIParser p = i.new INIParser();
			EObject fileContents = p.parse(r);
			TreeIterator<EObject> ti = fileContents.eAllContents();
			
			// See what we got
			while (ti.hasNext()) {
				EObject next = ti.next();
				// This will need to be spruced up for production, but gets the idea across easily
				if (next instanceof SectionImpl) {
					System.out.println("Should generate a DataComponent with :");
					System.out.println("    " + ((SectionImpl) next).getName());
				} else if (next instanceof LineImpl) {
					System.out.println("Should generate an Entry with :");
					System.out.println("    " + ((LineImpl) next).getName() + " : " + ((LineImpl) next).getValue());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/** 
	 * A wrapper class to our Xtext generated parser
	 * @author arbennett
	 */
	private class INIParser {
		
		@Inject
		private IParser parser;
		
		// Set up the parser
		public INIParser() {
			InputStandaloneSetupGenerated issg = new InputStandaloneSetupGenerated();
			Injector injector = issg.createInjectorAndDoEMFRegistration();
			injector.injectMembers(this);
		}
		
		// Do the parsing
		public EObject parse(Reader rdr) throws IOException {
			IParseResult result = parser.parse(rdr);
			if (result.hasSyntaxErrors()) {
				throw new ParseException("ERROR");
			}
			return result.getRootASTElement();
		}
	}
}
