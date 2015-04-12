package dw.xmlrpc.utest;

import static org.junit.Assert.*;
import dw.xmlrpc.SearchResult;

public class Test_SearchResult {
	@org.junit.Test(expected=IllegalArgumentException.class)
	public void ShouldntAcceptToBuildWithNullId(){
		new SearchResult(null, "title", 123456789, 123456789, 3, "snippet", 1);
	}

	@org.junit.Test
	public void toStringShouldntThrowNullRef(){
		SearchResult page = new SearchResult("id", null, null, null, null, null, null);
		assertNotNull(page.toString());
	}
}