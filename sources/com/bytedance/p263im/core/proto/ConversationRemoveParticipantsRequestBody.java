package com.bytedance.p263im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody */
public final class ConversationRemoveParticipantsRequestBody extends Message<ConversationRemoveParticipantsRequestBody, Builder> {
    public static final ProtoAdapter<ConversationRemoveParticipantsRequestBody> ADAPTER = new ProtoAdapter_ConversationRemoveParticipantsRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final Map<String, String> biz_ext;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String conversation_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long conversation_short_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer conversation_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = Label.REPEATED, tag = 4)
    public final List<Long> participants;

    /* renamed from: com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationRemoveParticipantsRequestBody, Builder> {
        public Map<String, String> biz_ext = Internal.newMutableMap();
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public List<Long> participants = Internal.newMutableList();

        public final ConversationRemoveParticipantsRequestBody build() {
            ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody = new ConversationRemoveParticipantsRequestBody(this.conversation_id, this.conversation_short_id, this.conversation_type, this.participants, this.biz_ext, super.buildUnknownFields());
            return conversationRemoveParticipantsRequestBody;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder biz_ext(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.biz_ext = map;
            return this;
        }

        public final Builder participants(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.participants = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody$ProtoAdapter_ConversationRemoveParticipantsRequestBody */
    static final class ProtoAdapter_ConversationRemoveParticipantsRequestBody extends ProtoAdapter<ConversationRemoveParticipantsRequestBody> {
        private final ProtoAdapter<Map<String, String>> biz_ext;

        public ProtoAdapter_ConversationRemoveParticipantsRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationRemoveParticipantsRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.biz_ext = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final ConversationRemoveParticipantsRequestBody redact(ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody) {
            Builder newBuilder = conversationRemoveParticipantsRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationRemoveParticipantsRequestBody.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationRemoveParticipantsRequestBody.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationRemoveParticipantsRequestBody.conversation_type) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(4, conversationRemoveParticipantsRequestBody.participants) + this.biz_ext.encodedSizeWithTag(5, conversationRemoveParticipantsRequestBody.biz_ext) + conversationRemoveParticipantsRequestBody.unknownFields().size();
        }

        public final ConversationRemoveParticipantsRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.participants.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            builder.biz_ext.putAll((Map) this.biz_ext.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationRemoveParticipantsRequestBody.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationRemoveParticipantsRequestBody.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationRemoveParticipantsRequestBody.conversation_type);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 4, conversationRemoveParticipantsRequestBody.participants);
            this.biz_ext.encodeWithTag(protoWriter, 5, conversationRemoveParticipantsRequestBody.biz_ext);
            protoWriter.writeBytes(conversationRemoveParticipantsRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_short_id = this.conversation_short_id;
        builder.conversation_type = this.conversation_type;
        builder.participants = Internal.copyOf("participants", this.participants);
        builder.biz_ext = Internal.copyOf("biz_ext", this.biz_ext);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.conversation_id != null) {
            i = this.conversation_id.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.conversation_short_id != null) {
            i2 = this.conversation_short_id.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.conversation_type != null) {
            i4 = this.conversation_type.hashCode();
        }
        int hashCode2 = ((((i6 + i4) * 37) + this.participants.hashCode()) * 37) + this.biz_ext.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (!this.participants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        if (!this.biz_ext.isEmpty()) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationRemoveParticipantsRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationRemoveParticipantsRequestBody)) {
            return false;
        }
        ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody = (ConversationRemoveParticipantsRequestBody) obj;
        if (!unknownFields().equals(conversationRemoveParticipantsRequestBody.unknownFields()) || !Internal.equals(this.conversation_id, conversationRemoveParticipantsRequestBody.conversation_id) || !Internal.equals(this.conversation_short_id, conversationRemoveParticipantsRequestBody.conversation_short_id) || !Internal.equals(this.conversation_type, conversationRemoveParticipantsRequestBody.conversation_type) || !this.participants.equals(conversationRemoveParticipantsRequestBody.participants) || !this.biz_ext.equals(conversationRemoveParticipantsRequestBody.biz_ext)) {
            return false;
        }
        return true;
    }

    public ConversationRemoveParticipantsRequestBody(String str, Long l, Integer num, List<Long> list, Map<String, String> map) {
        this(str, l, num, list, map, ByteString.EMPTY);
    }

    public ConversationRemoveParticipantsRequestBody(String str, Long l, Integer num, List<Long> list, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.participants = Internal.immutableCopyOf("participants", list);
        this.biz_ext = Internal.immutableCopyOf("biz_ext", map);
    }
}
