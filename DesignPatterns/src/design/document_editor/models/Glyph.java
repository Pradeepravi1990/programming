package design.document_editor.models;

public abstract class Glyph {
	
	public void Draw(Window window) {

	}

	public void Bounds(Rect rect) {

	}

	public boolean Intersects(final Point point) {
		return false;

	}

	public void Insert(Glyph glyph, int pos) {

	}

	public void Remove(Glyph glyph) {

	}

	public Glyph Child(int pos) {
		return null;

	}

	public Glyph Parent() {
		return null;

	}
}
