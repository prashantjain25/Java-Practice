package expressions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class RPNLatex {

    public static Map createMap(){
	Map latexKeys=new HashMap();
	
	latexKeys.put("mroot",() );
	latexKeys.put("mfrac", 	);
	//latexKeys.put("displaystyle");
	
	return latexKeys;
    }
    public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
File mathXml=new File("./expressions/mathExp.xml");
DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
DocumentBuilder dBuilder = null;

    dBuilder = dbFactory.newDocumentBuilder();

Document doc = dBuilder.parse(mathXml);
doc.getDocumentElement().normalize();

System.out.println(doc);

	//Stack stk=pushToStack(latexString);
	
	//prefixToInfix(latexString);
	
	Queue que=new PriorityQueue();
	
	
	//Pattern ptrn=Pattern.compile(latexString);
	
    }
    public static Stack pushToStack(String latexString)
    {
	Map operators=createMap();
	
	Pattern oper=Pattern.compile("\\w");
	Matcher matcher=oper.matcher(latexString);
	int count = 0;
        while(matcher.find()) {
            count++;
            matcher.end();
        }
	return new Stack();
	
    }
    public static String prefixToInfix(String latexString){
	
	return latexString;
	
    }

}
