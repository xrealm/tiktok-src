package org.apache.http.message;

import org.apache.http.HeaderElement;
import org.apache.http.ParseException;
import org.apache.http.util.CharArrayBuffer;

public interface HeaderValueParser {
    HeaderElement[] parseElements(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException;

    HeaderElement parseHeaderElement(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException;
}
