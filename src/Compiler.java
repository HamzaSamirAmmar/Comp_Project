
import ast.nodes.AbstractNode;
import ast.visitors.BaseVisitor;
import generated.HTMLLexer;
import generated.HTMLParser;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.FileWriter;
import java.io.IOException;

public class Compiler {

	static String filePath = "index.html";
	static String ASTPath = "AST.txt";
	
	protected static void showGUI(ParseTree pt, HTMLParser parser) {
		Trees.inspect(pt, parser);
	}
	
	public static void main(String[] argv) {
		CharStream cs;
		try {
			cs = CharStreams.fromFileName(filePath);
			HTMLLexer lexer = new HTMLLexer(cs);
			CommonTokenStream cts = new CommonTokenStream(lexer);
			HTMLParser parser = new HTMLParser(cts);
			ParseTree pt = parser.htmlDocument();
//		    showGUI(pt, parser);
			BaseVisitor visitor = new BaseVisitor();
			AbstractNode document = (AbstractNode) visitor.visit(pt);
			FileWriter resultFile = new FileWriter(ASTPath);
			resultFile.write(document.toString());
			resultFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
