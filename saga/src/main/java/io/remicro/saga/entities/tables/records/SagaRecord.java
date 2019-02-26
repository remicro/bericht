/*
 * This file is generated by jOOQ.
 */
package io.remicro.saga.entities.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.remicro.saga.entities.tables.Saga;
import io.remicro.saga.entities.tables.interfaces.ISaga;

import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SagaRecord extends UpdatableRecordImpl<SagaRecord> implements VertxPojo, Record5<UUID, String, UUID, Timestamp, Timestamp>, ISaga {

    private static final long serialVersionUID = -1144191799;

    /**
     * Setter for <code>public.saga.id</code>.
     */
    @Override
    public SagaRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.saga.id</code>.
     */
    @Override
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.saga.title</code>.
     */
    @Override
    public SagaRecord setTitle(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.saga.title</code>.
     */
    @Override
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.saga.owner_id</code>.
     */
    @Override
    public SagaRecord setOwnerId(UUID value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.saga.owner_id</code>.
     */
    @Override
    public UUID getOwnerId() {
        return (UUID) get(2);
    }

    /**
     * Setter for <code>public.saga.created_at</code>.
     */
    @Override
    public SagaRecord setCreatedAt(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.saga.created_at</code>.
     */
    @Override
    public Timestamp getCreatedAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.saga.updated_at</code>.
     */
    @Override
    public SagaRecord setUpdatedAt(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.saga.updated_at</code>.
     */
    @Override
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, String, UUID, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, String, UUID, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Saga.SAGA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Saga.SAGA.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field3() {
        return Saga.SAGA.OWNER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Saga.SAGA.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Saga.SAGA.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component3() {
        return getOwnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value3() {
        return getOwnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SagaRecord value1(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SagaRecord value2(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SagaRecord value3(UUID value) {
        setOwnerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SagaRecord value4(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SagaRecord value5(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SagaRecord values(UUID value1, String value2, UUID value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISaga from) {
        setId(from.getId());
        setTitle(from.getTitle());
        setOwnerId(from.getOwnerId());
        setCreatedAt(from.getCreatedAt());
        setUpdatedAt(from.getUpdatedAt());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISaga> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SagaRecord
     */
    public SagaRecord() {
        super(Saga.SAGA);
    }

    /**
     * Create a detached, initialised SagaRecord
     */
    public SagaRecord(UUID id, String title, UUID ownerId, Timestamp createdAt, Timestamp updatedAt) {
        super(Saga.SAGA);

        set(0, id);
        set(1, title);
        set(2, ownerId);
        set(3, createdAt);
        set(4, updatedAt);
    }

    public SagaRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
