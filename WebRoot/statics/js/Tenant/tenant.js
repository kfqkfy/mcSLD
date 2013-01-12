function getTenant() { 
	function createTenant(){
		function tenantInformation(){
			function review(){
			    var form = Ext.create('Ext.form.Panel', {
			        layout: 'absolute',
			        //url: 'save-form.php',
			        defaultType: 'textfield',
			        border: false,

			        items: [{
						fieldLabel: 'Summary',
						fieldWidth: 60,
			            x:5,
			            y:5,
			            xtype: 'textareafield',
						value:'Summary information to confirm process',
			            style: 'margin:0',
			            hideLabel: false,
			            name: 'description',
			            anchor: '-5 -5'  // anchor width and height
			        }]
			    });

			    var win = Ext.create('Ext.window.Window', {
			        title: 'Review',
			        width: 500,
			        height: 300,
			        minWidth: 300,
			        minHeight: 200,
			        layout: 'fit',
			        plain:true,
			        items: form,
			        buttons: [{
			            text: 'Cancle',
			            handler: function() {
			            	this.up('form').getForm().reset();
			            }              
			        },{
			            text: '< Back',
			            handler: function() {
			            	history.go(-1);
			            }
			            	
			        },{
			        	text:'Process >',
			        	handler: function() {
							alert('finish');
						}
			        }]
			    });

			    win.show();
			}
			var form = Ext.create('Ext.form.Panel',{
				    layout: 'absolute',			
			        defaultType: 'textfield',
			        border: false,

			        items: [{
			            fieldLabel: 'Tenant Name',
			            fieldWidth: 60,
			            msgTarget: 'side',		           
			            x: 5,
			            y: 5,
			            name: 'tenant',
			            anchor: '-5'  // anchor width by percentage
			        }, {
			            fieldLabel: 'DB Name',
			            fieldWidth: 60,
			            x: 5,
			            y: 35,
			            name: 'db',
			            anchor: '-5' // anchor width by percentage
			        }, {
			            xtype: 'combo',
			            fieldLabel: 'Chart Accounts',
			            name: 'chart_of_accounts',
					    fieldWidth: 60,
			            x: 5,
			            y: 65,
			            minValue: '12:00am',
			            maxValue: '4:00pm',
						anchor: '-5'     
			           }, {
			               xtype: 'combo',
			               fieldLabel: 'Base Language',
			               name: 'base_language',
			   		       fieldWidth: 60,
			               x: 5,
			               y: 95,
			               minValue: '10:00am',
			               maxValue: '4:00pm',
			   			   anchor: '-5'               
			           }, {
			               fieldLabel: 'Email',
			               name: 'email',
			   		       fieldWidth: 60,
			               x: 5,
			               y: 125,
			             //  vtype:'email'

			           }, {
			               fieldLabel: 'Phone',
			               name: 'phone',
			   		       fieldWidth: 60,
			               x: 5,
			               y: 155,		              
			           }],           

		        buttons: [{
		            text: 'Cancle',
		            handler: function() {
		            	this.up('form').getForm().reset();
		            }              
		        },{
		            text: '< Back',
		            handler: function() {
		            	history.go(-1);
		            }
		            	
		        },{
		        	text:'Next >',
		        	handler:review
		        }]
		    });
		var w = new Ext.Window({
			 title: 'Tenant Creation Wizard',
			 collapsible: true,
			 maximizable: true,
			 width: 500,
			 height: 300,
			 minWidth: 300,
			 minHeight: 200,
			 layout: 'fit',
			 items:form,
			 plain: true,
			 bodyStyle: 'padding:5px;',
			 buttonAlign: 'center',
			});
			w.show();
		}
		var myData = [
		              ['SU01',6.1,'Online',5],
		              ['SU02',6.0,'Online',2],
		              ['SU03',7.0,'Online',2],
		              ['SU04',6.0,'Online',1]
		          ];
		      	
		      	    // create the data store
		          var store = Ext.create('Ext.data.ArrayStore', {
		              fields: [
		                 {name: 'name'},
		                 {name: 'version', type: 'float'},
		                 {name: 'status'},
		                 {name: 'number_of_tenants',type:'float'}		 
		              ],
		              data: myData
		          });

		         var grid =  Ext.create('Ext.grid.Panel', {
		             store: store,
		          //   id: 'ten-panel',
		             bodyStyle:'width:100%', 
		             viewConfig : {
		            	  forceFit : true
		            	 },
		             columns: [{
		                 header: 'Name',
		                 dataIndex: 'name',
		      			width: 120,
		      			align:'center'
		             }, {
		                 header: 'Version',
		                 dataIndex: 'version',
		                 width: 120,
		                 align : 'left',
		                 sortable:false

		             }, {
		                 header: 'Status',
		                 dataIndex: 'status',             
		                 width: 120,
		                 sortable:false
		             },{
		      		   header: 'Number of Tenants', 
		      		   dataIndex:'number_of_tenants',
		                 width:120, 
		                 sortable :false,           
		              }],
		             renderTo: 'editor-grid',
		             width: 600,
		             height: 400,

		         });	          	
		            var window = Ext.create('Ext.window.Window', {
		                  title: 'Select Service Unit',
		                  html:'Select Service Unit in which you want to create a tenant',
		                  width: 500,
		                  height: 300,
		                  minWidth: 300,
		                  minHeight: 200,
		                  layout: 'fit',
		                  plain:true,
		                  items: grid,
		                  buttons: [{
		                      text: 'Cancel',
							  handler: function() {
										this.up('form').getForm().reset();
									}
		                  },{
		                      text: '< Back',
		                      handler:function(){
		                    	  history.go(-1);
		                      }
		                      
		                  },{
		                      text: 'Next >',
		                      handler:tenantInformation
		                  }]
		              });
		          
		              window.show();
	}
var myData = [
        ['OEC Computer', 'SU01', 6.0, '80%(10G)', 5,30,'Online'],
        ['Demo','SU03', 6.1, '10%(1.25G)', 10,280,'Restoring'],
        ['HiSoft','SU01', 7.0, '0%(20M)', 25,122,'Offline']
    ];
	
	    // create the data store
    var store = Ext.create('Ext.data.ArrayStore', {
        fields: [
           {name: 'name'},
           {name: 'service_unit'},
           {name: 'version', type: 'float'},
           {name: 'storage'},
           {name: 'active_user',type:'float'},// type: 'date', dateFormat: 'n/j h:ia'
		   {name: 'remaining_days', type: 'float'},
		   {name: 'monitor_status'},
			 
        ],
        data: myData
    });


    
    return {
    	
        grid :  Ext.create('Ext.grid.Panel', {
            store: store,
            id: 'ten-panel',
            bodyStyle:'width:100%', 
            viewConfig : {
            	  forceFit : true
            	 },
            columns: [{
                header: 'Name',
                dataIndex: 'name',
    			width: 150,
    			align:'center'

            }, {
                header: 'Service Unit',
                dataIndex: 'service_unit',
                width: 150,
                sortable:false

            }, {
                header: 'Version',
                dataIndex: 'version',
                width: 150,
                align : 'left',
                sortable:false

            }, {
            
                header: 'Storage',
                dataIndex: 'storage',             
                width: 150,
                sortable:false
            },{
    			 header: 'Active User', 
    			 dataIndex:'active_user',
                 width:120, 
                 sortable :false, 
                    
             },{
                    
            	header: 'Remaining Days',
            	dataIndex: 'remaining_days',
                width    : 120, 
                sortable : false 
                
             },{
            	header     : 'Monitor Status', 
            	dataIndex: 'monitor_status',
                width    : 120, 
                sortable : false 
                
              }],
            renderTo: 'editor-grid',
            width: 600,
            height: 400,
            title: 'Tenants',
            frame: true,
            tbar: [{
            	id:"newTenant",
            	xtype:'button',
                text: 'New',
                icon:'statics/images/icons/fam/user_add.gif',
                handler:createTenant         
            }, {
            	id:"upgradeTenant",
            	xtype:'button',
                text: 'Upgrade',
                icon:'statics/images/icons/fam/user_edit.gif',
    			disabled:true
            }, {
                itemId: 'removeEmployee',
                text: 'Delete',
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