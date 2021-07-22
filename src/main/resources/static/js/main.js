/** ALL */

/** TOP-BAR */

class Utilities {

    /**
     * GET THE CURRENT DATETIME.
     */
    NowDateTime () {
        let now = new Date();
        return document.getElementById("time").innerHTML = now.toLocaleString();
    }
    // FIXME modify setInterval method
    // setInterval(NowDateTime, 1000);

}