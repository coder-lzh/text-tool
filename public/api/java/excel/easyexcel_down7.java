ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
WriteSheet writeSheet = EasyExcel.writerSheet(DEFAULT_SHEET_NAME).build();
ExcelWriter excelWriter = EasyExcel.write(byteArrayOutputStream, User.class).build();
excelWriter.write(list, writeSheet);

InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
