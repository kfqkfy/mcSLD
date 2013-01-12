function getDataBase() { 
	
	function createDB(){
		  var form = Ext.create('Ext.form.Panel', {
		        layout: 'absolute',
		        //url: 'save-form.php',
		        defaultType: 'textfield',
		        border: false,

		        items: [{
		            fieldLabel: 'Name',
		            fieldWidth: 60,
		            msgTarget: 'side',
		            allowBlank: false,
		            x: 5,
		            y: 5,
		            name: 'name',
		            anchor: '-5'  // anchor width by percentage
		        }, {
		            fieldLabel: 'Server',
		            fieldWidth: 60,
		            x: 5,
		            y: 35,
		            name: 'server',
		            anchor: '-5' // anchor width by percentage
			    }, {
		            fieldLabel: 'Port',
		            fieldWidth: 60,
		            x: 5,
		            y: 65,
		            name: 'port',
		            anchor: '-5'
		        }, {
					fieldLabel: 'Description',
					fieldWidth: 60,
		            x:5,
		            y: 95,
		            xtype: 'textareafield',
		            style: 'margin:0',
		            hideLabel: false,
		            name: 'description',
		            anchor: '-5 -5'  // anchor width and height
		        }]
		    });

		    var win = Ext.create('Ext.window.Window', {
		        title: 'Database Instance Registration',
		        width: 500,
		        height: 300,
		        minWidth: 300,
		        minHeight: 200,
		        layout: 'fit',
		        plain:true,
		        items: form,

				 buttons: [{
						text:'Register',
						handler: function() {
							Ext.MessageBox.confirm('Confirm', 'Are you sure you want to do that?', showResult);
				
						 }              
					 },{
						 text: 'Close',
						 handler: function() {
							win.close();
						}
					 }]
		    });

		    win.show();
	}
	
	
	
	
	
var myData = [
        ['Main 01', 'SQLServer 2005', '2.0.1', '192.168.0.1','Online'],
        ['Main 02', 'SQLServer 2005', '3.0', '192.168.1.1','Restoring'],
        ['Backup 01', 'SQLServer 2005', '1.0', '192.168.0.2','Online']
    ];
	
	    // create the data store
    var store = Ext.create('Ext.data.ArrayStore', {
        fields: [
           {name: 'name'},
           {name: 'db_type'},
           {name: 'db_version'},
           {name: 'server_ip'},
           {name: 'monitor_status'}		 
        ],
        data: myData
    });


    
    return {
    	
        grid :  Ext.create('Ext.grid.Panel', {
            store: store,
            id: 'di-panel',
            columns: [{
                header: 'Name',
                dataIndex: 'name',
    			width: 200,
    			align:'center'

            }, {
                header: 'DB Type',
                dataIndex: 'db_type',
                width: 200,
                sortable:false

            }, {
                header: 'DB Version',
                dataIndex: 'db_version',
                width: 200,
                align : 'left',
                sortable:false

            }, {
            
                header: 'Server IP',
                dataIndex: 'server_ip',             
                width: 200,
                sortable:false
            },{
    			 header: 'Monitor Status', 
    			 dataIndex:'monitor_status',
                 width:200, 
                 sortable :false, 
              }],
            renderTo: 'editor-grid',
            width: 600,
            height: 400,
            title: 'Database Instances',
           // frame: true,
            tbar: [{
            	id:"register",
                text: 'Register',
                icon:'statics/images/icons/fam/user_add.gif',
    			handler: createDB
            }, {
                itemId: 'removeEmployee',
                text: 'Unregister',
                icon:'statics/images/icons/fam/user_delete.gif',
                handler: function() {
                    var sm = grid.getSelectionModel();
                    rowEditing.cancelEdit();
                    store.remove(sm.getSelection());
                    if (store.getCount() > 0) {
                        sm.select(0);
                    }
                },
                disabled: true
            }],
           // plugins: [rowEditing],
            listeners: {
                'selectionchange': function(view, records) {
                    this.down('#removeEmployee').setDisabled(!records.length);
                }
            }
        })
        
    	
    };
}