package com.p280ss.android.ugc.aweme.utils;

/* renamed from: com.ss.android.ugc.aweme.utils.MimeHelper */
public final class MimeHelper {

    /* renamed from: com.ss.android.ugc.aweme.utils.MimeHelper$FileType */
    public enum FileType {
        JPEG("FFD8FF"),
        PNG("89504E47"),
        GIF("47494638"),
        TIFF("49492A00"),
        BMP("424D"),
        DWG("41433130"),
        PSD("38425053"),
        RTF("7B5C727466"),
        XML("3C3F786D6C"),
        HTML("68746D6C3E"),
        DBX("CFAD12FEC5FD746F "),
        PST("2142444E"),
        OLE2("0xD0CF11E0A1B11AE1"),
        XLS_DOC("D0CF11E0"),
        MDB("5374616E64617264204A"),
        WPB("FF575043"),
        EPS_PS("252150532D41646F6265"),
        PDF("255044462D312E"),
        PWL("E3828596"),
        ZIP("504B0304"),
        RAR("52617221"),
        WAV("57415645"),
        AVI("41564920"),
        RAM("2E7261FD"),
        RM("2E524D46"),
        MOV("6D6F6F76"),
        ASF("3026B2758E66CF11"),
        MID("4D546864");
        
        private String value;

        public final String getValue() {
            return this.value;
        }

        public final void setValue(String str) {
            this.value = str;
        }

        private FileType(String str) {
            this.value = "";
            this.value = str;
        }
    }
}
