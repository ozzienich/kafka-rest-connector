package org.kebonbinatang.kafka.connector.http.source

import org.kebonbinatang.kafka.connector.http.schema.KafkaSchemaParser
import org.apache.kafka.connect.source.SourceRecord

trait KafkaSourceService[SchemaInputType, SchemaOutputType] {
    def sourceRecords: Seq[SourceRecord]
    val topic: String
    val schemaParser: KafkaSchemaParser[SchemaInputType, SchemaOutputType]
}
