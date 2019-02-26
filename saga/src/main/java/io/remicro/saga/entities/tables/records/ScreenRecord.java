/*
 * This file is generated by jOOQ.
 */
package io.remicro.saga.entities.tables.records;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;
import io.remicro.saga.entities.tables.Screen;
import io.remicro.saga.entities.tables.interfaces.IScreen;

import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class ScreenRecord extends UpdatableRecordImpl<ScreenRecord> implements VertxPojo, Record6<UUID, UUID, String, String, Timestamp, Timestamp>, IScreen {

    private static final long serialVersionUID = 487362541;

    /**
     * Setter for <code>public.screen.id</code>.
     */
    @Override
    public ScreenRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.screen.id</code>.
     */
    @Override
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.screen.owner_id</code>.
     */
    @Override
    public ScreenRecord setOwnerId(UUID value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.screen.owner_id</code>.
     */
    @Override
    public UUID getOwnerId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.screen.original</code>.
     */
    @Override
    public ScreenRecord setOriginal(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.screen.original</code>.
     */
    @Override
    public String getOriginal() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.screen.scaled</code>.
     */
    @Override
    public ScreenRecord setScaled(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.screen.scaled</code>.
     */
    @Override
    public String getScaled() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.screen.created_at</code>.
     */
    @Override
    public ScreenRecord setCreatedAt(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.screen.created_at</code>.
     */
    @Override
    public Timestamp getCreatedAt() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>public.screen.updated_at</code>.
     */
    @Override
    public ScreenRecord setUpdatedAt(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.screen.updated_at</code>.
     */
    @Override
    public Timestamp getUpdatedAt() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, UUID, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, UUID, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Screen.SCREEN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field2() {
        return Screen.SCREEN.OWNER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Screen.SCREEN.ORIGINAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Screen.SCREEN.SCALED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Screen.SCREEN.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Screen.SCREEN.UPDATED_AT;
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
    public UUID component2() {
        return getOwnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getOriginal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getScaled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
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
    public UUID value2() {
        return getOwnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOriginal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getScaled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScreenRecord value1(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScreenRecord value2(UUID value) {
        setOwnerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScreenRecord value3(String value) {
        setOriginal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScreenRecord value4(String value) {
        setScaled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScreenRecord value5(Timestamp value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScreenRecord value6(Timestamp value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ScreenRecord values(UUID value1, UUID value2, String value3, String value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IScreen from) {
        setId(from.getId());
        setOwnerId(from.getOwnerId());
        setOriginal(from.getOriginal());
        setScaled(from.getScaled());
        setCreatedAt(from.getCreatedAt());
        setUpdatedAt(from.getUpdatedAt());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IScreen> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ScreenRecord
     */
    public ScreenRecord() {
        super(Screen.SCREEN);
    }

    /**
     * Create a detached, initialised ScreenRecord
     */
    public ScreenRecord(UUID id, UUID ownerId, String original, String scaled, Timestamp createdAt, Timestamp updatedAt) {
        super(Screen.SCREEN);

        set(0, id);
        set(1, ownerId);
        set(2, original);
        set(3, scaled);
        set(4, createdAt);
        set(5, updatedAt);
    }

    public ScreenRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
