package devops.om;


import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.ObjectUtils;
import org.apache.torque.TorqueException;
import org.apache.torque.map.TableMap;
import org.apache.torque.om.BaseObject;
import org.apache.torque.om.ComboKey;
import org.apache.torque.om.DateKey;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.om.StringKey;
import org.apache.torque.om.Persistent;
import org.apache.torque.util.Criteria;
import org.apache.torque.util.Transaction;





/**
 * This class was autogenerated by Torque on:
 *
 * [Mon Mar 26 14:30:11 IST 2018]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to TurbineUserGroupRole
 */
public abstract class BaseTurbineUserGroupRole extends BaseObject
{
    /** Serial version */
    private static final long serialVersionUID = 1522054811803L;

    /** The Peer class */
    private static final TurbineUserGroupRolePeer peer =
        new TurbineUserGroupRolePeer();


    /** The value for the userId field */
    private int userId;

    /** The value for the groupId field */
    private int groupId;

    /** The value for the roleId field */
    private int roleId;


    /**
     * Get the UserId
     *
     * @return int
     */
    public int getUserId()
    {
        return userId;
    }


    /**
     * Set the value of UserId
     *
     * @param v new value
     */
    public void setUserId(int v) throws TorqueException
    {

        if (this.userId != v)
        {
            this.userId = v;
            setModified(true);
        }


        if (aTurbineUser != null && !(aTurbineUser.getUserId() == v))
        {
            aTurbineUser = null;
        }

    }

    /**
     * Get the GroupId
     *
     * @return int
     */
    public int getGroupId()
    {
        return groupId;
    }


    /**
     * Set the value of GroupId
     *
     * @param v new value
     */
    public void setGroupId(int v) throws TorqueException
    {

        if (this.groupId != v)
        {
            this.groupId = v;
            setModified(true);
        }


        if (aTurbineGroup != null && !(aTurbineGroup.getGroupId() == v))
        {
            aTurbineGroup = null;
        }

    }

    /**
     * Get the RoleId
     *
     * @return int
     */
    public int getRoleId()
    {
        return roleId;
    }


    /**
     * Set the value of RoleId
     *
     * @param v new value
     */
    public void setRoleId(int v) throws TorqueException
    {

        if (this.roleId != v)
        {
            this.roleId = v;
            setModified(true);
        }


        if (aTurbineRole != null && !(aTurbineRole.getRoleId() == v))
        {
            aTurbineRole = null;
        }

    }

    



    private TurbineUser aTurbineUser;

    /**
     * Declares an association between this object and a TurbineUser object
     *
     * @param v TurbineUser
     * @throws TorqueException
     */
    public void setTurbineUser(TurbineUser v) throws TorqueException
    {
        if (v == null)
        {
            setUserId( 0);
        }
        else
        {
            setUserId(v.getUserId());
        }
        aTurbineUser = v;
    }


    /**
     * Returns the associated TurbineUser object.
     * If it was not retrieved before, the object is retrieved from
     * the database
     *
     * @return the associated TurbineUser object
     * @throws TorqueException
     */
    public TurbineUser getTurbineUser()
        throws TorqueException
    {
        if (aTurbineUser == null && (this.userId != 0))
        {
            aTurbineUser = TurbineUserPeer.retrieveByPK(SimpleKey.keyFor(this.userId));
        }
        return aTurbineUser;
    }

    /**
     * Return the associated TurbineUser object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated TurbineUser object
     * @throws TorqueException
     */
    public TurbineUser getTurbineUser(Connection connection)
        throws TorqueException
    {
        if (aTurbineUser == null && (this.userId != 0))
        {
            aTurbineUser = TurbineUserPeer.retrieveByPK(SimpleKey.keyFor(this.userId), connection);
        }
        return aTurbineUser;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
     */
    public void setTurbineUserKey(ObjectKey key) throws TorqueException
    {

        setUserId(((NumberKey) key).intValue());
    }




    private TurbineGroup aTurbineGroup;

    /**
     * Declares an association between this object and a TurbineGroup object
     *
     * @param v TurbineGroup
     * @throws TorqueException
     */
    public void setTurbineGroup(TurbineGroup v) throws TorqueException
    {
        if (v == null)
        {
            setGroupId( 0);
        }
        else
        {
            setGroupId(v.getGroupId());
        }
        aTurbineGroup = v;
    }


    /**
     * Returns the associated TurbineGroup object.
     * If it was not retrieved before, the object is retrieved from
     * the database
     *
     * @return the associated TurbineGroup object
     * @throws TorqueException
     */
    public TurbineGroup getTurbineGroup()
        throws TorqueException
    {
        if (aTurbineGroup == null && (this.groupId != 0))
        {
            aTurbineGroup = TurbineGroupPeer.retrieveByPK(SimpleKey.keyFor(this.groupId));
        }
        return aTurbineGroup;
    }

    /**
     * Return the associated TurbineGroup object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated TurbineGroup object
     * @throws TorqueException
     */
    public TurbineGroup getTurbineGroup(Connection connection)
        throws TorqueException
    {
        if (aTurbineGroup == null && (this.groupId != 0))
        {
            aTurbineGroup = TurbineGroupPeer.retrieveByPK(SimpleKey.keyFor(this.groupId), connection);
        }
        return aTurbineGroup;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
     */
    public void setTurbineGroupKey(ObjectKey key) throws TorqueException
    {

        setGroupId(((NumberKey) key).intValue());
    }




    private TurbineRole aTurbineRole;

    /**
     * Declares an association between this object and a TurbineRole object
     *
     * @param v TurbineRole
     * @throws TorqueException
     */
    public void setTurbineRole(TurbineRole v) throws TorqueException
    {
        if (v == null)
        {
            setRoleId( 0);
        }
        else
        {
            setRoleId(v.getRoleId());
        }
        aTurbineRole = v;
    }


    /**
     * Returns the associated TurbineRole object.
     * If it was not retrieved before, the object is retrieved from
     * the database
     *
     * @return the associated TurbineRole object
     * @throws TorqueException
     */
    public TurbineRole getTurbineRole()
        throws TorqueException
    {
        if (aTurbineRole == null && (this.roleId != 0))
        {
            aTurbineRole = TurbineRolePeer.retrieveByPK(SimpleKey.keyFor(this.roleId));
        }
        return aTurbineRole;
    }

    /**
     * Return the associated TurbineRole object
     * If it was not retrieved before, the object is retrieved from
     * the database using the passed connection
     *
     * @param connection the connection used to retrieve the associated object
     *        from the database, if it was not retrieved before
     * @return the associated TurbineRole object
     * @throws TorqueException
     */
    public TurbineRole getTurbineRole(Connection connection)
        throws TorqueException
    {
        if (aTurbineRole == null && (this.roleId != 0))
        {
            aTurbineRole = TurbineRolePeer.retrieveByPK(SimpleKey.keyFor(this.roleId), connection);
        }
        return aTurbineRole;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
     */
    public void setTurbineRoleKey(ObjectKey key) throws TorqueException
    {

        setRoleId(((NumberKey) key).intValue());
    }
   
        
    private static List<String> fieldNames = null;

    /**
     * Generate a list of field names.
     *
     * @return a list of field names
     */
    public static synchronized List<String> getFieldNames()
    {
        if (fieldNames == null)
        {
            fieldNames = new ArrayList<String>();
            fieldNames.add("UserId");
            fieldNames.add("GroupId");
            fieldNames.add("RoleId");
            fieldNames = Collections.unmodifiableList(fieldNames);
        }
        return fieldNames;
    }

    /**
     * Retrieves a field from the object by field (Java) name passed in as a String.
     *
     * @param name field name
     * @return value
     */
    public Object getByName(String name)
    {
        if (name.equals("UserId"))
        {
            return new Integer(getUserId());
        }
        if (name.equals("GroupId"))
        {
            return new Integer(getGroupId());
        }
        if (name.equals("RoleId"))
        {
            return new Integer(getRoleId());
        }
        return null;
    }

    /**
     * Set a field in the object by field (Java) name.
     *
     * @param name field name
     * @param value field value
     * @return True if value was set, false if not (invalid name / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByName(String name, Object value )
        throws TorqueException, IllegalArgumentException
    {
        if (name.equals("UserId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setUserId(((Integer) value).intValue());
            return true;
        }
        if (name.equals("GroupId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setGroupId(((Integer) value).intValue());
            return true;
        }
        if (name.equals("RoleId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setRoleId(((Integer) value).intValue());
            return true;
        }
        return false;
    }

    /**
     * Retrieves a field from the object by name passed in
     * as a String.  The String must be one of the static
     * Strings defined in this Class' Peer.
     *
     * @param name peer name
     * @return value
     */
    public Object getByPeerName(String name)
    {
        if (name.equals(TurbineUserGroupRolePeer.USER_ID))
        {
            return new Integer(getUserId());
        }
        if (name.equals(TurbineUserGroupRolePeer.GROUP_ID))
        {
            return new Integer(getGroupId());
        }
        if (name.equals(TurbineUserGroupRolePeer.ROLE_ID))
        {
            return new Integer(getRoleId());
        }
        return null;
    }

    /**
     * Set field values by Peer Field Name
     *
     * @param name field name
     * @param value field value
     * @return True if value was set, false if not (invalid name / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByPeerName(String name, Object value)
        throws TorqueException, IllegalArgumentException
    {
      if (TurbineUserGroupRolePeer.USER_ID.equals(name))
        {
            return setByName("UserId", value);
        }
      if (TurbineUserGroupRolePeer.GROUP_ID.equals(name))
        {
            return setByName("GroupId", value);
        }
      if (TurbineUserGroupRolePeer.ROLE_ID.equals(name))
        {
            return setByName("RoleId", value);
        }
        return false;
    }

    /**
     * Retrieves a field from the object by Position as specified
     * in the xml schema.  Zero-based.
     *
     * @param pos position in xml schema
     * @return value
     */
    public Object getByPosition(int pos)
    {
        if (pos == 0)
        {
            return new Integer(getUserId());
        }
        if (pos == 1)
        {
            return new Integer(getGroupId());
        }
        if (pos == 2)
        {
            return new Integer(getRoleId());
        }
        return null;
    }

    /**
     * Set field values by its position (zero based) in the XML schema.
     *
     * @param position The field position
     * @param value field value
     * @return True if value was set, false if not (invalid position / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByPosition(int position, Object value)
        throws TorqueException, IllegalArgumentException
    {
    if (position == 0)
        {
            return setByName("UserId", value);
        }
    if (position == 1)
        {
            return setByName("GroupId", value);
        }
    if (position == 2)
        {
            return setByName("RoleId", value);
        }
        return false;
    }
     
    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
     *
     * @throws TorqueException
     */
    public void save() throws TorqueException
    {
        save(TurbineUserGroupRolePeer.DATABASE_NAME);
    }

    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
     * Note: this code is here because the method body is
     * auto-generated conditionally and therefore needs to be
     * in this file instead of in the super class, BaseObject.
     *
     * @param dbName
     * @throws TorqueException
     */
    public void save(String dbName) throws TorqueException
    {
        Connection con = null;
        try
        {
            con = Transaction.begin(dbName);
            save(con);
            Transaction.commit(con);
        }
        catch(TorqueException e)
        {
            Transaction.safeRollback(con);
            throw e;
        }
    }

    /** flag to prevent endless save loop, if this object is referenced
        by another object which falls in this transaction. */
    private boolean alreadyInSave = false;
    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.  This method
     * is meant to be used as part of a transaction, otherwise use
     * the save() method and the connection details will be handled
     * internally
     *
     * @param con
     * @throws TorqueException
     */
    public void save(Connection con) throws TorqueException
    {
        if (!alreadyInSave)
        {
            alreadyInSave = true;



            // If this object has been modified, then save it to the database.
            if (isModified())
            {
                if (isNew())
                {
                    TurbineUserGroupRolePeer.doInsert((TurbineUserGroupRole) this, con);
                    setNew(false);
                }
                else
                {
                    TurbineUserGroupRolePeer.doUpdate((TurbineUserGroupRole) this, con);
                }
            }

            alreadyInSave = false;
        }
    }



    private final SimpleKey[] pks = new SimpleKey[3];
    private final ComboKey comboPK = new ComboKey(pks);

    /**
     * Set the PrimaryKey with an ObjectKey
     *
     * @param key
     */
    public void setPrimaryKey(ObjectKey key) throws TorqueException
    {
        SimpleKey[] keys = (SimpleKey[]) key.getValue();
        setUserId(((NumberKey)keys[0]).intValue());
        setGroupId(((NumberKey)keys[1]).intValue());
        setRoleId(((NumberKey)keys[2]).intValue());
    }

    /**
     * Set the PrimaryKey using SimpleKeys.
     *
     * @param userId int
     * @param groupId int
     * @param roleId int
     */
    public void setPrimaryKey( int userId, int groupId, int roleId)
        throws TorqueException
    {
        setUserId(userId);
        setGroupId(groupId);
        setRoleId(roleId);
    }

    /**
     * Set the PrimaryKey using a String.
     */
    public void setPrimaryKey(String key) throws TorqueException
    {
        setPrimaryKey(new ComboKey(key));
    }

    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
        pks[0] = SimpleKey.keyFor(getUserId());
        pks[1] = SimpleKey.keyFor(getGroupId());
        pks[2] = SimpleKey.keyFor(getRoleId());
        return comboPK;
    }
 

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     */
    public TurbineUserGroupRole copy() throws TorqueException
    {
        return copy(true);
    }

    /**
     * Makes a copy of this object using connection.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     *
     * @param con the database connection to read associated objects.
     */
    public TurbineUserGroupRole copy(Connection con) throws TorqueException
    {
        return copy(true, con);
    }

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
     * If the parameter deepcopy is true, it then fills all the
     * association collections and sets the related objects to
     * isNew=true.
     *
     * @param deepcopy whether to copy the associated objects.
     */
    public TurbineUserGroupRole copy(boolean deepcopy) throws TorqueException
    {
        return copyInto(new TurbineUserGroupRole(), deepcopy);
    }

    /**
     * Makes a copy of this object using connection.
     * It creates a new object filling in the simple attributes.
     * If the parameter deepcopy is true, it then fills all the
     * association collections and sets the related objects to
     * isNew=true.
     *
     * @param deepcopy whether to copy the associated objects.
     * @param con the database connection to read associated objects.
     */
    public TurbineUserGroupRole copy(boolean deepcopy, Connection con) throws TorqueException
    {
        return copyInto(new TurbineUserGroupRole(), deepcopy, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     */
    protected TurbineUserGroupRole copyInto(TurbineUserGroupRole copyObj) throws TorqueException
    {
        return copyInto(copyObj, true);
    }

  
    /**
     * Fills the copyObj with the contents of this object using connection.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param con the database connection to read associated objects.
     */
    protected TurbineUserGroupRole copyInto(TurbineUserGroupRole copyObj, Connection con) throws TorqueException
    {
        return copyInto(copyObj, true, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * If deepcopy is true, The associated objects are also copied
     * and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param deepcopy whether the associated objects should be copied.
     */
    protected TurbineUserGroupRole copyInto(TurbineUserGroupRole copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setUserId(userId);
        copyObj.setGroupId(groupId);
        copyObj.setRoleId(roleId);

        copyObj.setUserId( 0);
        copyObj.setGroupId( 0);
        copyObj.setRoleId( 0);

        if (deepcopy)
        {
        }
        return copyObj;
    }
        
    
    /**
     * Fills the copyObj with the contents of this object using connection.
     * If deepcopy is true, The associated objects are also copied
     * and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param deepcopy whether the associated objects should be copied.
     * @param con the database connection to read associated objects.
     */
    protected TurbineUserGroupRole copyInto(TurbineUserGroupRole copyObj, boolean deepcopy, Connection con) throws TorqueException
    {
        copyObj.setUserId(userId);
        copyObj.setGroupId(groupId);
        copyObj.setRoleId(roleId);

        copyObj.setUserId( 0);
        copyObj.setGroupId( 0);
        copyObj.setRoleId( 0);

        if (deepcopy)
        {
        }
        return copyObj;
    }
    
    

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public TurbineUserGroupRolePeer getPeer()
    {
        return peer;
    }

    /**
     * Retrieves the TableMap object related to this Table data without
     * compiler warnings of using getPeer().getTableMap().
     *
     * @return The associated TableMap object.
     */
    public TableMap getTableMap() throws TorqueException
    {
        return TurbineUserGroupRolePeer.getTableMap();
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("TurbineUserGroupRole:\n");
        str.append("UserId = ")
           .append(getUserId())
           .append("\n");
        str.append("GroupId = ")
           .append(getGroupId())
           .append("\n");
        str.append("RoleId = ")
           .append(getRoleId())
           .append("\n");
        return(str.toString());
    }
}
