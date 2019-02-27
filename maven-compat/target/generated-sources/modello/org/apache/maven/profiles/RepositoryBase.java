// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.profiles;

/**
 * 
 *          Repository contains the information needed
 *          for establishing connections with remote repository
 *       .
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class RepositoryBase
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * 
     *             A unique identifier for a repository.
     *           
     */
    private String id;

    /**
     * 
     *             Human readable name of the repository
     *           .
     */
    private String name;

    /**
     * 
     *              The url of the repository
     *           .
     */
    private String url;

    /**
     * The type of layout this repository uses for locating and
     * storing artifacts - can be "legacy" or
     *             "default".
     */
    private String layout = "default";


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get a unique identifier for a repository.
     * 
     * @return String
     */
    public String getId()
    {
        return this.id;
    } //-- String getId()

    /**
     * Get the type of layout this repository uses for locating and
     * storing artifacts - can be "legacy" or
     *             "default".
     * 
     * @return String
     */
    public String getLayout()
    {
        return this.layout;
    } //-- String getLayout()

    /**
     * Get human readable name of the repository.
     * 
     * @return String
     */
    public String getName()
    {
        return this.name;
    } //-- String getName()

    /**
     * Get the url of the repository.
     * 
     * @return String
     */
    public String getUrl()
    {
        return this.url;
    } //-- String getUrl()

    /**
     * Set a unique identifier for a repository.
     * 
     * @param id
     */
    public void setId( String id )
    {
        this.id = id;
    } //-- void setId( String )

    /**
     * Set the type of layout this repository uses for locating and
     * storing artifacts - can be "legacy" or
     *             "default".
     * 
     * @param layout
     */
    public void setLayout( String layout )
    {
        this.layout = layout;
    } //-- void setLayout( String )

    /**
     * Set human readable name of the repository.
     * 
     * @param name
     */
    public void setName( String name )
    {
        this.name = name;
    } //-- void setName( String )

    /**
     * Set the url of the repository.
     * 
     * @param url
     */
    public void setUrl( String url )
    {
        this.url = url;
    } //-- void setUrl( String )

    
            public boolean equals( Object obj )
            {
                RepositoryBase other =  (RepositoryBase) obj;

                boolean retValue = false;

                if ( id != null )
                {
                    retValue = id.equals( other.id );
                }

                return retValue;
            }
          
}