/*
 * This file is generated by jOOQ.
 */
package io.remicro.saga.entities.tables;


import io.remicro.saga.entities.Indexes;
import io.remicro.saga.entities.Keys;
import io.remicro.saga.entities.Public;
import io.remicro.saga.entities.tables.records.ScrollRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Scroll extends TableImpl<ScrollRecord> {

    private static final long serialVersionUID = -360692997;

    /**
     * The reference instance of <code>public.scroll</code>
     */
    public static final Scroll SCROLL = new Scroll();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScrollRecord> getRecordType() {
        return ScrollRecord.class;
    }

    /**
     * The column <code>public.scroll.id</code>.
     */
    public final TableField<ScrollRecord, UUID> ID = createField("id", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("uuid_generate_v4()", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>public.scroll.title</code>.
     */
    public final TableField<ScrollRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.scroll.desc</code>.
     */
    public final TableField<ScrollRecord, String> DESC = createField("desc", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.scroll.vision</code>.
     */
    public final TableField<ScrollRecord, Integer> VISION = createField("vision", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.scroll.saga_id</code>.
     */
    public final TableField<ScrollRecord, UUID> SAGA_ID = createField("saga_id", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.scroll.created_at</code>.
     */
    public final TableField<ScrollRecord, Timestamp> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>public.scroll.updated_at</code>.
     */
    public final TableField<ScrollRecord, Timestamp> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>public.scroll</code> table reference
     */
    public Scroll() {
        this(DSL.name("scroll"), null);
    }

    /**
     * Create an aliased <code>public.scroll</code> table reference
     */
    public Scroll(String alias) {
        this(DSL.name(alias), SCROLL);
    }

    /**
     * Create an aliased <code>public.scroll</code> table reference
     */
    public Scroll(Name alias) {
        this(alias, SCROLL);
    }

    private Scroll(Name alias, Table<ScrollRecord> aliased) {
        this(alias, aliased, null);
    }

    private Scroll(Name alias, Table<ScrollRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Scroll(Table<O> child, ForeignKey<O, ScrollRecord> key) {
        super(child, key, SCROLL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SCROLL_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ScrollRecord> getPrimaryKey() {
        return Keys.SCROLL_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScrollRecord>> getKeys() {
        return Arrays.<UniqueKey<ScrollRecord>>asList(Keys.SCROLL_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ScrollRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ScrollRecord, ?>>asList(Keys.SCROLL__FK_SAGA_SCROLL);
    }

    public Saga saga() {
        return new Saga(this, Keys.SCROLL__FK_SAGA_SCROLL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Scroll as(String alias) {
        return new Scroll(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Scroll as(Name alias) {
        return new Scroll(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Scroll rename(String name) {
        return new Scroll(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Scroll rename(Name name) {
        return new Scroll(name, null);
    }
}