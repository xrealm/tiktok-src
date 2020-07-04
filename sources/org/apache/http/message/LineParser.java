package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.ParseException;
import org.apache.http.StatusLine;
import org.apache.http.util.CharArrayBuffer;

public interface LineParser {
    boolean hasProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor);

    Header parseHeader(CharArrayBuffer charArrayBuffer) throws ParseException;

    StatusLine parseStatusLine(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException;
}