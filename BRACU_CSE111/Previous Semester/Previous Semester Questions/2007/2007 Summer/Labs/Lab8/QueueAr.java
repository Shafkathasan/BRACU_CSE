// QueueAr class
    //

    // CONSTRUCTION: with or without a capacity; default is 10
    //
    // ******************PUBLIC OPERATIONS*********************
    // void enqueue( x )      --> Insert x
    // Object getFront( )     --> Return least recently inserted item
    // Object dequeue( )      --> Return and remove least recent item
    // boolean isEmpty( )     --> Return true if empty; else false
    // boolean isFull( )      --> Return true if capacity reached
    // void makeEmpty( )      --> Remove all items
    // ******************ERRORS********************************
    // Overflow thrown for enqueue on full queue

    /**
     * Array-based implementation of the queue.
     * @author Mark Allen Weiss
     */
    public class QueueAr
    {
        /**
         * Construct the queue.
         */
        public QueueAr( )
        {

        }

        /**
         * Construct the queue.
         */
        public QueueAr( int capacity )
        {

        }

        /**
         * Test if the queue is logically empty.
         * @return true if empty, false otherwise.
         */
        public boolean isEmpty( )
        {

        }

        /**
         * Test if the queue is logically full.
         * @return true if full, false otherwise.
         */
        public boolean isFull( )
        {
        }

        /**
         * Make the queue logically empty.
         */
        public void makeEmpty( )
        {
        }

        /**
         * Get the least recently inserted item in the queue.
         * Does not alter the queue.
         * @return the least recently inserted item in the queue, or null, if empty.
         */
        public Object getFront( )
        {
        }

        /**
         * Return and remove the least recently inserted item from the queue.
         * @return the least recently inserted item in the queue, or null, if empty.
         */
        public Object dequeue( )
        {
        }

        /**
         * Insert a new item into the queue.
         * @param x the item to insert.
         * @exception Overflow if queue is full.
         */
        public void enqueue( Object x ) throws Overflow
        {
        }

        /**
         * Internal method to increment with wraparound.
         * @param x any index in theArray's range.
         * @return x+1, or 0, if x is at the end of theArray.
         */
        private int increment( int x )
        {
        }


        static final int DEFAULT_CAPACITY = 10;


        public static void main( String [ ] args )
        {
            QueueAr q = new QueueAr( );

            try
            {
                for( int i = 0; i < 10; i++ )
                    q.enqueue( new Integer( i ) );
            }
            catch( Overflow e ) { System.out.println( "Unexpected overflow" ); }

            while( !q.isEmpty( ) )
                System.out.println( q.dequeue( ) );
        }    
    }