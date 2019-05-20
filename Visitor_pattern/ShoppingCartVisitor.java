package Visitor_pattern;


public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}
