// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.profiles;

/**
 * Root element of the profiles.xml file.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class ProfilesRoot
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field profiles.
     */
    private java.util.List<Profile> profiles;

    /**
     * Field activeProfiles.
     */
    private java.util.List<String> activeProfiles;

    /**
     * Field modelEncoding.
     */
    private String modelEncoding = "UTF-8";


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addActiveProfile.
     * 
     * @param string
     */
    public void addActiveProfile( String string )
    {
        getActiveProfiles().add( string );
    } //-- void addActiveProfile( String )

    /**
     * Method addProfile.
     * 
     * @param profile
     */
    public void addProfile( Profile profile )
    {
        getProfiles().add( profile );
    } //-- void addProfile( Profile )

    /**
     * Method getActiveProfiles.
     * 
     * @return List
     */
    public java.util.List<String> getActiveProfiles()
    {
        if ( this.activeProfiles == null )
        {
            this.activeProfiles = new java.util.ArrayList<String>();
        }

        return this.activeProfiles;
    } //-- java.util.List<String> getActiveProfiles()

    /**
     * Get the modelEncoding field.
     * 
     * @return String
     */
    public String getModelEncoding()
    {
        return this.modelEncoding;
    } //-- String getModelEncoding()

    /**
     * Method getProfiles.
     * 
     * @return List
     */
    public java.util.List<Profile> getProfiles()
    {
        if ( this.profiles == null )
        {
            this.profiles = new java.util.ArrayList<Profile>();
        }

        return this.profiles;
    } //-- java.util.List<Profile> getProfiles()

    /**
     * Method removeActiveProfile.
     * 
     * @param string
     */
    public void removeActiveProfile( String string )
    {
        getActiveProfiles().remove( string );
    } //-- void removeActiveProfile( String )

    /**
     * Method removeProfile.
     * 
     * @param profile
     */
    public void removeProfile( Profile profile )
    {
        getProfiles().remove( profile );
    } //-- void removeProfile( Profile )

    /**
     * Set list of manually-activated build profiles, specified in
     * the order in which
     *             they should be applied.
     * 
     * @param activeProfiles
     */
    public void setActiveProfiles( java.util.List<String> activeProfiles )
    {
        this.activeProfiles = activeProfiles;
    } //-- void setActiveProfiles( java.util.List )

    /**
     * Set the modelEncoding field.
     * 
     * @param modelEncoding
     */
    public void setModelEncoding( String modelEncoding )
    {
        this.modelEncoding = modelEncoding;
    } //-- void setModelEncoding( String )

    /**
     * Set configuration of build profiles for adjusting the build
     *             according to environmental parameters.
     * 
     * @param profiles
     */
    public void setProfiles( java.util.List<Profile> profiles )
    {
        this.profiles = profiles;
    } //-- void setProfiles( java.util.List )

}
