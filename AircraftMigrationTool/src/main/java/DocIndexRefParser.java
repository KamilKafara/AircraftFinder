import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class DocIndexRefParser implements RecordParser  {

    public static List<DocIndexRef> parseDocIndexRefs(Stream<String> lines) {
        return lines.map(DocIndexRefParser::parseRecord).collect(Collectors.toList());
    }

    private static DocIndexRef parseRecord(String record) {
        String[] recordArray = record.split(SEPARATOR);
        DocIndexRef.DocIndexRefBuilder aircraftRef = new DocIndexRef.DocIndexRefBuilder()
                .typeCollateral(getTypeCollateral(recordArray))
                .collateral(recordArray[DocIndexRefColumn.COLLATERAL.getRefNumber()])
                .nameOfParty(recordArray[DocIndexRefColumn.NAME_OF_PARTY.getRefNumber()])
                .docId(recordArray[DocIndexRefColumn.DOC_ID.getRefNumber()])
                .drDate(recordArray[DocIndexRefColumn.DR_DATE.getRefNumber()])
                .processingDate(recordArray[DocIndexRefColumn.PROCESSING_DATE.getRefNumber()])
                .corrDate(recordArray[DocIndexRefColumn.CORR_DATE.getRefNumber()])
                .corrId(recordArray[DocIndexRefColumn.CORR_ID.getRefNumber()])
                .serialId(recordArray[DocIndexRefColumn.SERIAL_ID.getRefNumber()]);
        return aircraftRef.build();
    }

    private static TypeCollateral getTypeCollateral(String[] recordArray) {
        String value = recordArray[DocIndexRefColumn.TYPE.getRefNumber()];
        return TypeCollateral.getType(value);
    }
}
