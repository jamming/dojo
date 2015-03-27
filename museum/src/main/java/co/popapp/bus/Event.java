/*
 * $URL$
 * $Revision$ $Date$
 * $Author$
 */

// P A C K A G E ///////////////////////////////////////////////////////////////////////////////////
package co.popapp.bus;

// I M P O R T /////////////////////////////////////////////////////////////////////////////////////

// C L A S S ///////////////////////////////////////////////////////////////////////////////////////
public abstract class Event<S> {
    public final long time = System.currentTimeMillis ();
    public final S source;
    public Event (S aSource) { source = aSource; }
    public void cancel () { throw new CancelledException (); }
}
// E O F ///////////////////////////////////////////////////////////////////////////////////////////
